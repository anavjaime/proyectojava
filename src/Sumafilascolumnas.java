import java.util.Scanner;

public class Sumafilascolumnas {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;

        int[][] matriz = new int[FILAS][COLUMNAS];
        Scanner scanner = new Scanner(System.in);

        // Cargar la matriz con valores enteros
        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Sumar elementos de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < FILAS; i++) {
            int sumaFila = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Sumar elementos de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < COLUMNAS; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < FILAS; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        scanner.close();
    }
}