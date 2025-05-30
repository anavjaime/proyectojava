
import java.util.Random;

public class Vectornumeros {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10]; // Definir el vector de 10 enteros
        Random rand = new Random(); // Para generar números aleatorios

        // Inicializar el vector con números aleatorios del 1 al 10
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1; // rand.nextInt(10) genera 0-9, +1 da 1-10
        }

        // Mostrar cada elemento con su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + "\t\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
