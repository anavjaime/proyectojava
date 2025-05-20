public class Ejercicio15 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("Nombres ordenados alfabéticamente:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (nombre1.compareToIgnoreCase(nombre2) > 0) {
            System.out.println("Nombres ordenados alfabéticamente:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Los nombres son iguales");
        }
        scanner.close();
    }
    
}