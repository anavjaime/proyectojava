import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar sueldo de persona");
        int valor = input.nextInt();
        if (valor > 3000) {
            System.out.println("abonar impuestos");
        } else {
            System.out.println("no debe pagar impuestos");
        }
    }
}