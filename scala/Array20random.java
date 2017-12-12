import java.util.Random;
public class Array20random {
    public static void main(String[] args) {
        int j = 21;
        int[] arr;
        int amax = 0;
        int anummax = 0;
        int amin = 10;
        int anummin = 0;
        int x = 0;
        arr = new int[j];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print("/"+arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
        if (arr[i] < 0 & arr[i] < amax){
            amax = arr[i];
            anummax = i;
            }
        if (arr[i] > 0 & arr[i] < amin){
            amin = arr[i];
            anummin = i;
        }
        }
        System.out.println("");
        System.out.println("amax= "+amax+" "+anummax);
        System.out.println("amin= "+amin+" "+anummin);

        x = arr[anummax];
        arr[anummax] = arr[anummin];
        arr[anummin] = x;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("/" + arr[i]);
        }
        }
    }

