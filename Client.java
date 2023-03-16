import java.rmi.server.*;
import java.rmi.*;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            MathFunctions obj = (MathFunctions) Naming.lookup("rmi://localhost/MathFunctions");

            while (true) {
                System.out.println("\nEnter your choice:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modular");
                System.out.println("6. Factorial");
                System.out.println("7. Power");
                System.out.println("8. Exit");
                int choice = sc.nextInt();
                if (choice == 8) {
                    break;
                }
                System.out.println("Enter two integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();   
                int result = 0;
                switch (choice) {
                    case 1:
                        result = obj.add(a, b);
                        System.out.println("Addition: " + result);
                        break;
                    case 2:
                        result = obj.subtract(a, b);
                        System.out.println("Subtraction: " + result);
                        break;
                    case 3:
                        result = obj.multiply(a, b);
                        System.out.println("Multiplication: " + result);
                        break;
                    case 4:
                        result = obj.divide(a, b);
                        System.out.println("Division: " + result);
                        break;
                    case 5:
                        result = obj.modulo(a, b);
                        System.out.println("Modulo: " + result);
                        break;
                    case 6:
                        result = obj.factorial(a);
                        System.out.println("Factorial of " + a + ": " + result);
                        break;
                    case 7:
                        result = obj.power(a, b);
                        System.out.println("Power: " + result);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
