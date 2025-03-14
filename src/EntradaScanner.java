import java.util.Scanner;

public class EntradaScanner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad = scanner.nextByte();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
}