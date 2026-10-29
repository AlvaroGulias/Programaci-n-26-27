package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numero = comprobarNumero(leerNumero());

        while (numero != 0) {
            boolean todosPares = determinarParImpar(numero);
            visualizarResultado(numero, todosPares);
            numero = comprobarNumero(leerNumero());
        }
        System.out.println("Fin");
    }

    public static int leerNumero() {
        System.out.println("Introduce un numero de 4 dígitos (0 para terminar): ");
        return sc.nextInt();
    }

    public static int comprobarNumero(int numero) {

        while (numero != 0 && (numero < 1000 || numero > 9999)) {
            System.out.println("el número debe tener 4 dígitos.");
            numero = leerNumero();
        }
        return numero;
    }

    public static boolean determinarParImpar(int numero) {
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                return false;
            }
            numero = numero / 10;
        }
        return true;
    }

    public static void visualizarResultado(int numero, boolean todosPares) {
        if (todosPares) {
            System.out.println("El número " + numero + " tiene todos los dígitos pares");
        } else {
            System.out.println("El número " + numero + " tiene dígitos impares");
        }
    }
}