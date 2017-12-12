import java.util.Scanner;
public class Choice {
    public static void main(String[] args) {
        System.out.println("Enter number 1 if you want to use calc or number 2 if you need to find the longest word");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        if (q == 1)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            double i = sc.nextFloat();
            System.out.println("Enter mathematic action");
            char mult = sc.next().charAt(0);
            System.out.println("Enter second number");
            double y = sc.nextFloat();
            sc.close();

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
                    scanner.close();
            }
        }
        else{
            System.out.println("Enter amount of words");
            Scanner sca = new Scanner(System.in);
            int i = sca.nextInt();
            String[] words;
            words = new String[i];
            int j = 0;
            String a = (" ");
            int b = 0;
            System.out.println("Enter "+i+" words");
            while(j < i){
                Scanner scan = new Scanner(System.in);
                words[j] = scan.nextLine();

                if (words[j].length() >= a.length()) {
                    a = words[j];
                    b = j;
                }
                j++;
            }
            System.out.println("The longest word is "+"'"+words[b]+"'");
        }
        scanner.close();
    }
}

