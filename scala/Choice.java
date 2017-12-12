import java.util.Scanner;
public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        if (a==1){

            Calc cal = new Calc();
            Calc.start();
        }

        else{
            Array array = new Array();
        }

    }
}
