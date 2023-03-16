import java.rmi.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// This class sets up the server to receive remote invocations
public class Server {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            MathFunctions obj = new MathFunctionsImpl();
            
            // Create the RMI registry on the server
            LocateRegistry.createRegistry(2000);
            
            // Bind the remote object to the registry using a well-known name
            Naming.rebind("MathFunctions", obj);
            
            System.out.println("MathFunctions server ready.");
        } catch (Exception e) {
            System.out.println("MathFunctions server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}