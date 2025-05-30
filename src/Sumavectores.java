import java.util.Scanner;

public class Sumavectores {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner scanner = new Scanner(System.in);

        // Leer valores para vector1
        System.out.println("Introduce 5 valores para vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        // Leer valores para vector2
        System.out.println("\nIntroduce 5 valores para vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular vector3 = vector1 + vector2
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar vector3
        System.out.println("\nResultado de la suma (vector3):");
        for (int i = 0; i < 5; i++) {
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }

        scanner.close();
    }
}