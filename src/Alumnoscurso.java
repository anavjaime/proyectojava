
import java.util.ArrayList;
import java.util.Scanner;

public class Alumnoscurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para guardar los datos
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Entrada de datos
        while (true) {
            System.out.print("Introduce el nombre del alumno (o * para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\nAlumnos mayores de edad (18 o más):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        // Buscar la edad máxima
        int edadMax = -1;
        for (int edad : edades) {
            if (edad > edadMax) {
                edadMax = edad;
            }
        }

        // Mostrar alumnos con la edad máxima
        System.out.println("\nAlumno(s) con mayor edad (" + edadMax + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMax) {
                System.out.println(nombres.get(i));
            }
        }

        scanner.close();
    }
}
