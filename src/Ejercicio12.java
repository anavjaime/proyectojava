import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int count100to300 = 0;
        int countAbove300 = 0;
        double totalSalaries = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                count100to300++;
            } else if (sueldo > 300) {
                countAbove300++;
            }

            totalSalaries += sueldo;
        }

        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + count100to300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + countAbove300);
        System.out.println("Gasto total en sueldos: $" + totalSalaries);

        scanner.close();
    }
}