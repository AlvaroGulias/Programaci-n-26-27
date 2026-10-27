package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import java.util.Scanner;
public class Ejercicio10 {


    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner sc = new Scanner(System.in);

        String continuar = "";

        do{
           double euros = introducirEuros(sc);
           String moneda = introducirMoneda(sc);
           double cambio = cambiarMoneda(euros, moneda);
           imprimir(euros, moneda, cambio);
           continuar = introducirRespuesra(sc);
       }while(!continuar.equalsIgnoreCase("no"));
    }

    public static String introducirRespuesra(Scanner sc){
        String continuar = "";
        System.out.println("¿Desea continuar? SI/NO"); continuar = sc.next();
        return continuar;
    }

    public static String introducirMoneda(Scanner sc){
        String cambio_moneda = "";

        do{
            System.out.println("Introduce la monda a la que quieres cambiar (dolares/yenes/libras): "); cambio_moneda = sc.next();
        }while(!cambio_moneda.equalsIgnoreCase("yenes") && !cambio_moneda.equalsIgnoreCase("dolares") && !cambio_moneda.equalsIgnoreCase("libras") );

        return cambio_moneda;
    }

    public static double introducirEuros(Scanner sc){
        double cantidad_euros = 0.0;

        do{
            System.out.println("Introduce una cantidad de €: "); cantidad_euros = sc.nextDouble();

            if(cantidad_euros < 1){
                System.out.println("la cantidad debe ser mayor a 0");
            }
        }while (cantidad_euros <= 0);

        return cantidad_euros;
    }

    public static double cambiarMoneda(double euros, String tipo_moneda){
        double cambio = 0.0;
        double DOLARES = 1.11, YENES = 120.63, LIBRAS = 0.87;
        switch (tipo_moneda){
            case "dolares":
                cambio  = euros * DOLARES;
               break;
            case "yenes":
                cambio = euros * YENES;
                break;
            case "libras":
                cambio = euros * LIBRAS;
                break;
            default:
                System.out.println("hubo un error al calcular el cambio");
                break;
        }
        return cambio;
    }

    public static void imprimir(double euros, String moneda, double cambio){
        System.out.printf("%.2f € equivalen a %.2f %s%n", euros, cambio, moneda);
    }


}
