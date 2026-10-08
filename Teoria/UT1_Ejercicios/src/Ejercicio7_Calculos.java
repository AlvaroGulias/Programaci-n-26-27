public class Ejercicio7_Calculos {

    static void main(String[] args) {

        //1. Suponiendo que un bollo de pan nos cuesta 0,87 céntimos y un kilo de queso 13,10 euros. Visualizar por pantalla cuánto debo pagar por un bocadillo que contiene 150 gramos de queso.
        double bolloPan = 0.87, kiloQueso = 13.10;

        double precioBocadillo = bolloPan + (kiloQueso * 150 / 1000);

        System.out.println("El precio del bocadillo es: " + precioBocadillo + "€");

        //2. Visualiza por pantalla el siguiente mensaje: Tenemos en clase una invasión de hormigas, concretamente (el valor que debes asignar al identificador es: 6*10 elevado a 100).

        int numeroOrmigas1 = 6 * 10;
        long numeroOrmigas2 = (long) Math.pow(numeroOrmigas1, 100);

        System.out.println("Tenemos en clase una invasión de hormigas, concretamente " + numeroOrmigas2);
    }
}
