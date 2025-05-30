
import java.util.Arrays;
import java.util.Random;

public class Ordenarvector {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Vector de 10 elementos
        Random rand = new Random();

        // Inicializar con números aleatorios del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1; // 1 a 100
        }

        // Mostrar vector antes de ordenar
        System.out.println("Vector original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Ordenar el vector de menor a mayor
        Arrays.sort(numeros);

        // Mostrar vector ordenado
        System.out.println("\n\nVector ordenado (menor a mayor):");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
