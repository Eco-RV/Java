
import java.util.Scanner;

public class loops {

    public static void main(String[] args){

        Scanner user = new Scanner(System.in);

        System.out.print("Digite la cantidad: ");
        int cantidad = user.nextInt();

        int suma = 0;

        System.out.println("Digite los Numeros: ");

        for(int i = 1;i<=cantidad;i++) {
            suma += user.nextInt();
        }
        int promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);

    }
}