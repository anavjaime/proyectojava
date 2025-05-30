
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        final int DIAS = 5;
        double[] tempMin = new double[DIAS];
        double[] tempMax = new double[DIAS];
        Scanner scanner = new Scanner(System.in);

        // Leer temperaturas mínimas y máximas
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1));
            System.out.print("Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // Mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < DIAS; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2.0;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }

        // Buscar la temperatura mínima más baja
        double minAbsoluta = tempMin[0];
        for (int i = 1; i < DIAS; i++) {
            if (tempMin[i] < minAbsoluta) {
                minAbsoluta = tempMin[i];
            }
        }

        // Mostrar los días con la menor temperatura mínima
        System.out.println("\nDía(s) con menor temperatura mínima (" + minAbsoluta + "°C):");
        for (int i = 0; i < DIAS; i++) {
            if (tempMin[i] == minAbsoluta) {
                System.out.println("Día " + (i + 1));
            }
        }

        // Buscar días con temperatura máxima igual a una introducida
        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        double tempBuscada = scanner.nextDouble();
        boolean encontrada = false;

        System.out.println("Día(s) con temperatura máxima igual a " + tempBuscada + "°C:");
        for (int i = 0; i < DIAS; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ningún día con esa temperatura máxima.");
        }

        scanner.close();
    }
}
