import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numero de preguntas");
        float numPreguntas = input.nextFloat();
        System.out.println("Ingrese numero de preguntas correctas");
        float numCorrectas = input.nextFloat();
        float porcentaje = (numCorrectas/numPreguntas)*100;
        System.out.println("El nivel es " + porcentaje);
        if (porcentaje >= 90) {
            System.out.println("NIvel maximo");

        }else{
            if (porcentaje >=75 & porcentaje < 90 ) {
                System.out.println("Nivel medio");
            }
            else{
                if (porcentaje >= 50 & porcentaje < 75  ) {
                    System.out.println("Nivel regular");
                }
                else{
                    if (porcentaje < 50) {
                        System.out.println("Fura de nivel");
                    }
                }
            }
        }

    }
}