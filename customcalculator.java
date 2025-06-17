import java.util.Scanner;

// Custom Exception Classes
class MyArithmaticException extends Exception {
    public MyArithmaticException(String msg) {
        super(msg);
    }

    public String toString() {
        return "Custom Arithmetic Exception: " + getMessage();
    }
}

class DividebyZeroException extends Exception {
    public DividebyZeroException(String msg) {
        super(msg);
    }

    public String toString() {
        return "Custom Divide by Zero Exception: " + getMessage();
    }
}

class IlligalarguException extends Exception {
    public IlligalarguException(String msg) {
        super(msg);
    }

    public String toString() {
        return "Custom Illegal Argument Exception: " + getMessage();
    }
}

// Calculator Class
public class customcalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) throws DividebyZeroException {
        if (b == 0) {
            throw new DividebyZeroException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1. add\t 2. sub\t 3. mul\t 4. div");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + sub(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + mul(a, b));
                    break;
                case 4:
                    double result = div(a, b); // might throw DividebyZeroException
                    System.out.println("Result: " + result);
                    break;
                default:
                    throw new IlligalarguException("Invalid menu choice: " + choice);
            }

        } catch (DividebyZeroException e) {
            System.out.println(e);
        } catch (IlligalarguException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e);
        }
 
        sc.close();
    }
}
