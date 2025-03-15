import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        byte num1 = scanner.nextByte();
        System.out.print("Ingrese el segundo número: ");
        byte num2 = scanner.nextByte();
        System.out.print("Ingrese el tercer número: ");
        byte num3 = scanner.nextByte();

        boolean resultado = (num1 > num2) && (num1 < num3);

        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);
    }
}