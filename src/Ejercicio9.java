import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.print("Ingrese su primer nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Ingrese su segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Ingrese su tercera nota: ");
        double nota3 = input.nextDouble();
        double promedio = (nota1 + nota2 + nota3)/3;
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4 && promedio < 7) {
            System.out.println("Regular");
        } else if (promedio < 4) {
            System.out.println("Reprobado");
        }
        System.out.println("El promedio es: " + promedio);
        input.close();
    }
}