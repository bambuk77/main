import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double i = scanner.nextFloat();
        System.out.println("Enter mathematic action");
        char mult = scanner.next().charAt(0);
        System.out.println("Enter second number");
        double y = scanner.nextFloat();
        scanner.close();

        switch (mult)
        {
            case '+':
                System.out.print("Addition: ");
                System.out.printf("%.4f", i + y);
                break;
            case '-':
                System.out.print("Subtraction: ");
                System.out.printf("%.4f", i - y);
                break;
            case '*':
                System.out.print("Multiplication: ");
                System.out.printf("%.4f", i * y);
                break;
            case '/':
                System.out.print("Division: ");
                System.out.printf("%.4f", i / y);
                break;
            default:
                System.out.print("Error+");
        }
    }
}
