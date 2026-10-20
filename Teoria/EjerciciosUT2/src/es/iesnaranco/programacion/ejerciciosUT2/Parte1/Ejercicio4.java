package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte temperaturaHoy = 0, temperaturaAyer = 0;
        String estadoDia = "";
        byte VALOR = 20;

        System.out.println("Temperatura hoy: "); temperaturaHoy = sc.nextByte();
        System.out.println("Temperatura ayer: "); temperaturaAyer = sc.nextByte();
        System.out.println("Estado del dia: "); estadoDia = sc.next();

        if(temperaturaHoy > VALOR && estadoDia.equalsIgnoreCase("llueve")){
            System.out.println("Hace calor pero está llviendo");
            System.out.println("Entre ayer y hoy la temperatura fue de: " + (temperaturaAyer + temperaturaHoy));
            System.out.println("Mañana habra " + (temperaturaHoy + 5));
        } else if (temperaturaHoy <= VALOR) {
            System.out.println("parece que llega otoño");
            System.out.println(estadoDia.equalsIgnoreCase("sol") ? "Pero luce sol" : "y llueve");
        }
    }
}
