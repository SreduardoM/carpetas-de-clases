package tarea1.utn;

import java.util.Scanner;

public class ClaseUnoE {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

    /*Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
     (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
      ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
      ● Tener 3 o más inmuebles.
      ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
       societarios que demuestren capacidad económica plena.”*/



        System.out.println("Cuales son sus ingresos?" + "\n");
        double ingresos = consola.nextDouble();

        System.out.println("Cuantos vehiculos posee cuya antiguedad sea menor a 5 años?" + "\n" );
        int cantidadDeVehiculos = consola.nextInt();

        System.out.println("Cuantos inmuebles posee?" + "\n");
        int cantidadDeInmuebles = consola.nextInt();

        System.out.println("Usted posee una embarcación, una aeronave de lujo o ser titular de activos " +
                "societarios que demuestren capacidad económica plena" + "\n" );
        String poseedorDeArticulosDeLujo = consola.next();

        if (ingresos >= 489.083 || cantidadDeVehiculos >= 3 || cantidadDeInmuebles >=3
                || poseedorDeArticulosDeLujo.equalsIgnoreCase("si")) {

            System.out.println("Perteneces al segmento de ingresos altos");

        } else {
            System.out.println("Perteneces al segmento de ingresos bajos");

        }
    }
}
