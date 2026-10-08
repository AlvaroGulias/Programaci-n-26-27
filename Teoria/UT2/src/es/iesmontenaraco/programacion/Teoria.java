package es.iesmontenaraco.programacion;


import java.util.Scanner;
public class Teoria {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1 = 1, numero2 = 1, numero3 = 3;

        if((numero2 == numero1) && (numero1 < numero3)){
            System.out.println("Es verdad");
        }

        int edad = 0;

        /*System.out.println("Introduce tu edad"); edad = sc.nextInt();

        if (edad < 18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }

        if (edad < 18){
            System.out.println("Eres menor de edad");
        }else if(edad > 17 && edad < 70){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres jubilado");
        }
*/
        int nota = 0;
        System.out.println("Introduce la nota: "); nota = sc.nextInt();

            if(nota >= 0 && nota <=4){
                System.out.println("Suspenso");
            } else if (nota >= 5 && nota <= 6) {
                System.out.println("Aprobado");
            } else if (nota >= 7 && nota <= 8) {
                System.out.println("Notable");
            }else if(nota >= 9 && nota <= 10){
                System.out.println("Sobresaliente");
            }else{
                System.out.println("Nota no válida");
            }
    }
}
