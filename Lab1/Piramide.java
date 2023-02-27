package Lab1;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Scanner;

public class Piramide {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite el número de filas: ");
        int num_Rows = scan.nextInt();
        int spaces = num_Rows;

        for (int f = 1; f <= num_Rows; f++) {
            for (int e = 1; e <= spaces; e++) {
                System.out.print(" ");
            }
            spaces--;
            
            for (int i = 1; i<=f;i++) {
                System.out.print(f + " ");
            }
            System.out.println();
        }

    }

}
