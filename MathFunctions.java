import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

// This interface defines the methods that will be available for remote invocation
// Here instead of using "IntfName" as interface name, I am using "Mathfunction"
// It looks more meaningful
public interface MathFunctions extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
    int multiply(int a, int b) throws RemoteException;
    int divide(int a, int b) throws RemoteException;
    int modulo(int a, int b) throws RemoteException;
    int factorial(int a) throws RemoteException;
    int power(int a, int b) throws RemoteException;
}
