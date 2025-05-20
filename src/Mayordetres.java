import java.util.Scanner;

public class Mayordetres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        byte num1 = scanner.nextByte();
        System.out.print("Ingrese el segundo número: ");
        byte num2 = scanner.nextByte();
        System.out.print("Ingrese el tercer número: ");
        byte num3 = scanner.nextByte();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}