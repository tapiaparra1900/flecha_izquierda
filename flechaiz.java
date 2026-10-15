
import java.util.Scanner;

public class Asteriscos {
    public static void main(String[] args) {

        Scanner objscanner = new Scanner(System.in);

        int num, i, j, k, l;

        System.out.print("Dame un numero: ");
        num = objscanner.nextInt();

        // Numeros ascendentes
        for (i = 1; i <= num; i++) {

            System.out.print(i + "\t");

            // Espacios
            for (j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos ascendentes
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Numeros descendentes
        for (k = num - 1; k >= 1; k--) {

            System.out.print(k + "\t");

            // Espacios
            for (l = 1; l <= num - k; l++) {
                System.out.print(" ");
            }

            // Asteriscos descendentes
            for (l = 1; l <= k; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
