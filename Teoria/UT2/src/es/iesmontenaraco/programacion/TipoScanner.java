package es.iesmontenaraco.programacion;

import java.util.Scanner;

public class TipoScanner {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0;
        String nombre = "";
        System.out.println("Introduce tu edad: "); edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime tu nombre: "); nombre = sc.nextLine();
        System.out.println("La edad es: " + edad + ", el nombre es: " + nombre);
        sc.close();
    }
}
