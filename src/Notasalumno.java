
import java.util.Scanner;

public class Notasalumno {
    public static void main(String[] args) {
        double[] notas = new double[5]; // Vector para guardar 5 notas
        Scanner scanner = new Scanner(System.in);

        // Leer las 5 notas asegurando que estén entre 0 y 10
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Introduce la nota " + (i + 1) + " (0 a 10): ");
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 10); // Validación
            notas[i] = nota;
        }

        // Mostrar todas las notas
        System.out.println("\nNotas introducidas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Calcular media, máxima y mínima
        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        double media = suma / notas.length;

        // Mostrar resultados
        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        scanner.close();
    }
}
