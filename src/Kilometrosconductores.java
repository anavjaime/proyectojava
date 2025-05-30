
import java.util.Scanner;

public class Kilometrosconductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_CONDUCTORES = 3; // Puedes cambiar la cantidad
        final int DIAS_SEMANA = 7;

        String[] nombres = new String[NUM_CONDUCTORES];
        int[][] kms = new int[NUM_CONDUCTORES][DIAS_SEMANA];
        int[] total_kms = new int[NUM_CONDUCTORES];

        // Leer nombres y kilómetros
        for (int i = 0; i < NUM_CONDUCTORES; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Introduce los kilómetros conducidos cada día de la semana:");
            for (int j = 0; j < DIAS_SEMANA; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Limpiar buffer
        }

        // Calcular total kilómetros por conductor
        for (int i = 0; i < NUM_CONDUCTORES; i++) {
            int suma = 0;
            for (int j = 0; j < DIAS_SEMANA; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }

        // Mostrar resultados
        System.out.println("\nKilómetros totales por conductor:");
        for (int i = 0; i < NUM_CONDUCTORES; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }

        scanner.close();
    }
}
