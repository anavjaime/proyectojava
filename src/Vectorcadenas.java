
import java.util.Scanner;

public class Vectorcadenas {
    public static void main(String[] args) {
        String[] vectorOriginal = new String[5]; // Vector original
        String[] vectorInverso = new String[5];  // Vector para guardar en orden inverso
        Scanner scanner = new Scanner(System.in); // Para leer desde teclado

        // Leer datos del usuario
        System.out.println("Introduce 5 palabras:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        // Copiar los elementos en orden inverso
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Mostrar el vector inverso
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInverso.length; i++) {
            System.out.println("Posición " + i + ": " + vectorInverso[i]);
        }

        scanner.close();
    }
}
