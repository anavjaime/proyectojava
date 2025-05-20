import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su sueldo: ");
        double sueldo = scanner.nextDouble();
        
        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = scanner.nextInt();
        
        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo *= 1.20;
                System.out.println("Sueldo con aumento del 20%: " + sueldo);
            } else {
                sueldo *= 1.05;
                System.out.println("Sueldo con aumento del 5%: " + sueldo);
            }
        } else {
            System.out.println("Sueldo sin cambios: " + sueldo);
        }
        scanner.close();
    }
}