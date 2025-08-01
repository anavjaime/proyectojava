
import java.util.Scanner;

public class Quinielafutbol {
    public static void main(String[] args) {
        final int PARTIDOS = 15;
        final int EQUIPOS_POR_PARTIDO = 2;

        String[][] equipos = new String[PARTIDOS][EQUIPOS_POR_PARTIDO];
        int[][] resultados = new int[PARTIDOS][EQUIPOS_POR_PARTIDO];

        Scanner scanner = new Scanner(System.in);

        // Entrada de datos: nombres de equipos y resultados
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1));

            for (int j = 0; j < EQUIPOS_POR_PARTIDO; j++) {
                System.out.print("Nombre equipo " + (j + 1) + ": ");
                equipos[i][j] = scanner.nextLine();
            }

            for (int j = 0; j < EQUIPOS_POR_PARTIDO; j++) {
                System.out.print("Goles del equipo " + equipos[i][j] + ": ");
                resultados[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // limpiar buffer
            System.out.println();
        }

        // Mostrar resultados
        System.out.println("Resultados de la quiniela:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.printf("Partido %2d: %s %d - %d %s\n",
                i + 1,
                equipos[i][0], resultados[i][0],
                resultados[i][1], equipos[i][1]);
        }

        scanner.close();
    }
}
