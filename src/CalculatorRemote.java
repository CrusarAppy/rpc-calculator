import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorRemote extends UnicastRemoteObject implements Calculator {

    CalculatorRemote() throws RemoteException{
        super();
    }
    @Override
    public int add(int x, int y) throws RemoteException {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) throws RemoteException {
        return x - y ;
    }

    @Override
    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

    @Override
    public int divide(int x, int y) throws RemoteException {
        return x / y;
    }
}
