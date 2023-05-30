import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CalculatorServer {
    public static void main(String args[]){
        try {
            Calculator stub = new CalculatorRemote();
            Naming.rebind("rmi://localhost:8088/calculator" , stub);
            System.out.print("Server Started");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
}
