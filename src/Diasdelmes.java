import java.util.Scanner;

public class Diasdelmes {
    public static void main(String[] args) {
        // Vectores con nombres de meses y días correspondientes
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombre = nombresMeses[numeroMes - 1]; // -1 por índice
            int dias = diasMeses[numeroMes - 1];

            System.out.println("\nEl mes " + nombre + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe ser entre 1 y 12.");
        }

        scanner.close();
    }
}