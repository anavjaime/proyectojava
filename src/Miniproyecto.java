import java.util.Scanner;

public class Miniproyecto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese un numero");
            byte num1 = scanner.nextByte();
            System.out.println("ingrese un numero");
            byte num2 = scanner.nextByte();
            System.out.println("ingrese un numero");
            byte num3 = scanner.nextByte();
            int sum = (num1 + num2 + num3);
            float promedio = sum / 3 ;

            System.out.println("la media es : " + promedio);
        }

    }

}
