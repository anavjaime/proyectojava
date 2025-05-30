
public class Matrizdiagonal {
    public static void main(String[] args) {
        final int N = 5;
        int[][] diagonal = new int[N][N];

        // Cargar la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz diagonal 5x5:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
