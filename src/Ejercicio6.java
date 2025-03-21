import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numero positivo");
        int numpositivo = input.nextInt();
        if (numpositivo >=1 ){
        } else {
            System.out.println("numero no valido");
        }
        System.out.println("numero negativo");
        int numnegativo = input.nextInt();
        if (numnegativo <=1 ){
        } else {
            System.out.println("numero no valido");
        }
        System.out.println("numero nulo");
        int numnulo = input.nextInt();
        if (numnulo >=0 && numnulo <=0 ){
        } else {
            System.out.println("numero no valido");
        }
    }
}