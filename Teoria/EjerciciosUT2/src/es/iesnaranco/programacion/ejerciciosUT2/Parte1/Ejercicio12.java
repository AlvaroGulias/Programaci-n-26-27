package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import java.util.Scanner;

public class Ejercicio12 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio12 ej = new Ejercicio12();
        ej.empezar();
    }

    public void empezar(){
        double resultado_final = 0.0;
        double primer_cateto = introducircateto();
        double segundo_cateto = introducircateto();
        resultado_final = calcularHipotenusa(primer_cateto, segundo_cateto);
        visualizar_resulatdo(resultado_final);
    }

    public double introducircateto(){
        double valor = 0.0;
        System.out.println("Introduce el valor del cateto: "); valor = sc.nextDouble();
        return valor;
    }

    public double calcularHipotenusa(double primer_cateto, double segundo_cateto){
        return Math.sqrt(Math.pow(primer_cateto, 2) + Math.pow(segundo_cateto, 2));
    }

    public void visualizar_resulatdo(double resultado_final){
        System.out.println("El resultado de la hypotenusa es: " + resultado_final);
    }

}
