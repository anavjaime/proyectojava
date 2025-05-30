
import java.util.Scanner;

public class Ventasempresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ARTICULOS = 5;
        final int SUCURSALES = 4;

        double[] precios = new double[ARTICULOS];
        int[][] cantidades = new int[SUCURSALES][ARTICULOS];

        // Leer precios de los artículos
        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < ARTICULOS; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Leer cantidades vendidas en cada sucursal
        System.out.println("\nIntroduce las cantidades vendidas por cada sucursal:");
        for (int s = 0; s < SUCURSALES; s++) {
            System.out.println("Sucursal " + (s + 1) + ":");
            for (int a = 0; a < ARTICULOS; a++) {
                System.out.print("Cantidad vendida del artículo " + (a + 1) + ": ");
                cantidades[s][a] = scanner.nextInt();
            }
        }

        // 1. Cantidades totales de cada artículo (sumar por columnas)
        int[] totalPorArticulo = new int[ARTICULOS];
        for (int a = 0; a < ARTICULOS; a++) {
            int suma = 0;
            for (int s = 0; s < SUCURSALES; s++) {
                suma += cantidades[s][a];
            }
            totalPorArticulo[a] = suma;
        }

        // 2. Cantidad total de artículos en la sucursal 2 (índice 1)
        int totalSucursal2 = 0;
        for (int a = 0; a < ARTICULOS; a++) {
            totalSucursal2 += cantidades[1][a];
        }

        // 3. Cantidad del artículo 3 en sucursal 1 (índices 0 y 2)
        int cantidadArticulo3Sucursal1 = cantidades[0][2];

        // 4. Recaudación total de cada sucursal
        double[] recaudacionSucursal = new double[SUCURSALES];
        for (int s = 0; s < SUCURSALES; s++) {
            double suma = 0;
            for (int a = 0; a < ARTICULOS; a++) {
                suma += cantidades[s][a] * precios[a];
            }
            recaudacionSucursal[s] = suma;
        }

        // 5. Recaudación total de la empresa
        double recaudacionTotalEmpresa = 0;
        for (int s = 0; s < SUCURSALES; s++) {
            recaudacionTotalEmpresa += recaudacionSucursal[s];
        }

        // 6. Sucursal de mayor recaudación
        int sucursalMayor = 0;
        double mayorRecaudacion = recaudacionSucursal[0];
        for (int s = 1; s < SUCURSALES; s++) {
            if (recaudacionSucursal[s] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[s];
                sucursalMayor = s;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidades totales de cada artículo:");
        for (int a = 0; a < ARTICULOS; a++) {
            System.out.println("Artículo " + (a + 1) + ": " + totalPorArticulo[a]);
        }

        System.out.println("\nCantidad total de artículos en la sucursal 2: " + totalSucursal2);
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidadArticulo3Sucursal1);

        System.out.println("\nRecaudación total por sucursal:");
        for (int s = 0; s < SUCURSALES; s++) {
            System.out.printf("Sucursal %d: $%.2f\n", s + 1, recaudacionSucursal[s]);
        }

        System.out.printf("\nRecaudación total de la empresa: $%.2f\n", recaudacionTotalEmpresa);
        System.out.println("Sucursal con mayor recaudación: Sucursal " + (sucursalMayor + 1));

        scanner.close();
    }
}
