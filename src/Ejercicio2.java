import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ingrese nota 1");
        int nota1 = input.nextInt();
        System.out.println("ingrese nota 2");
        int nota2 = input.nextInt();
        System.out.println("ingrese nota 3");
        int nota3 = input.nextInt();
        double promedio = (nota1 + nota2 + nota3)/3;
        if (promedio >=7 ) {
            System.out.println("promocionado");
        } else {
            System.out.println("no promocionado");
        }
    }
}
