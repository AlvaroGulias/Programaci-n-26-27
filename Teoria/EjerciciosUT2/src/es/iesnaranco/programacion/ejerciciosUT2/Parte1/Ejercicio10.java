package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import java.util.Scanner;
public class Ejercicio10 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio10 ej = new Ejercicio10();
        ej.run();
    }

    public void run(){
       double euros = introducirEuros();
       String moneda = introducirMoneda();
       double cambio = cambiarMoneda(euros, moneda);
       imprimir(euros, moneda, cambio);
    }

    public String introducirMoneda(){
        String cambio_moneda = "";

        do{
            System.out.println("Introduce la monda a la que quieres cambiar (dolares/yenes/libras): "); cambio_moneda = sc.next();
        }while(!cambio_moneda.equalsIgnoreCase("yenes") && !cambio_moneda.equalsIgnoreCase("dolares") && !cambio_moneda.equalsIgnoreCase("libras") );

        return cambio_moneda;
    }

    public double introducirEuros(){
        double cantidad_euros = 0.0;

        do{
            System.out.println("Introduce una cantidad de €: "); cantidad_euros = sc.nextDouble();

            if(cantidad_euros < 1){
                System.out.println("la cantidad debe ser mayor a 0");
            }
        }while (cantidad_euros <= 0);

        return cantidad_euros;
    }

    public double cambiarMoneda(double euros, String tipo_moneda){
        double cambio = 0.0;

        switch (tipo_moneda){
            case "dolares":
                cambio  = euros * 1.11;
               break;
            case "yenes":
                cambio = euros * 120.63;
                break;
            case "libras":
                cambio = euros * 0.87;
                break;
            default:
                System.out.println("hubo un error al calcular el cambio");
                break;
        }
        return cambio;
    }

    public void imprimir(double euros, String moneda, double cambio){
        System.out.printf("%.2f € equivalen a %.2f %s%n", euros, cambio, moneda);
    }


}
