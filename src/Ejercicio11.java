import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayoresOIguales7 = 0;
        int menores7 = 0;
    
        for (int i = 1; i <= 10; i++) {
             System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();
    
            if (nota >= 7) {
                 mayoresOIguales7++;
            } else {
                menores7++;
            }
        }
    
        System.out.println("Cantidad de notas mayores o iguales a 7: " + mayoresOIguales7);
        System.out.println("Cantidad de notas menores a 7: " + menores7);
    
        scanner.close();
    }
}