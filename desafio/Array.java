import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = in.nextInt();
        }

        System.out.println("\n----Números digitalizados-----\n");

        for (int n : numeros) {
            System.out.println("Número: " + n);
        }
    }
}