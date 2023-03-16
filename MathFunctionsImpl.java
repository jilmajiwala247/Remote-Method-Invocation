import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// This class implements the MathFunctions interface and provides the actual implementation for each method
public class MathFunctionsImpl extends UnicastRemoteObject implements MathFunctions {
    protected MathFunctionsImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Addition");
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Subtraction");
        return a - b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Multiplication");
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Division");
        return a / b;
    }

    @Override
    public int modulo(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Modular");
        return a % b;
    }

    @Override
    public int factorial(int a) throws RemoteException {
        System.out.println("\n Client has selected Factorial");
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public int power(int a, int b) throws RemoteException {
        System.out.println("\n Client has selected Power");
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
