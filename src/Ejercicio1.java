public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        float num1 = 15;
        float num2 =10;
        if (num1 > num2) {
            System.out.println( "La suma es: "+ (int) (num1 + num2));
            System.out.println("La diferencia es: " + (int) (num1 - num2));
        } else {
            System.out.println("El producto es: " + (int) (num1 = num2));
            System.out.println("La division es: " + (int) (num1 / num2));
        }
    }
}
