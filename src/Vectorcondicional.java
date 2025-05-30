
import java.util.Scanner;

public class Vectorcondicional {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Vector de 10 enteros
        Scanner scanner = new Scanner(System.in);

        int contador = 0; // Para contar cuántos elementos se ingresaron

        // Pedir números hasta llenar el vector o encontrar un número negativo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número (negativo para salir): ");
            int num = scanner.nextInt();

            if (num < 0) {
                break; // Salir si es negativo
            }

            numeros[i] = num;
            contador++; // Contamos cuántos números válidos se ingresaron
        }

        // Imprimir solo los elementos introducidos
        System.out.println("\nNúmeros introducidos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
