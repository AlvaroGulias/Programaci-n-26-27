package es.iesmontenaraco.programacion;


import java.util.Scanner;
public class Teoria {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1 = 1, numero2 = 1, numero3 = 3;

        if((numero2 == numero1) && (numero1 < numero3)){
            System.out.println("Es verdad");
        }else{
            System.out.println("Mentira");
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
        /*byte nota = 0;
        System.out.println("Introduce la nota: "); nota = sc.nextByte();

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
            }*/

        /*byte numero_mes = 0;
        System.out.print("Escribe un número del mes: "); numero_mes = sc.nextByte();

        if(numero_mes >= 1 && numero_mes <= 12){

            switch (numero_mes){
                case 1: System.out.println("Enero"); break;
                case 2: System.out.println("Febrero"); break;
                case 3: System.out.println("Marzo"); break;
                case 4: System.out.println("Abril"); break;
                case 5: System.out.println("Mayo"); break;
                case 6: System.out.println("Junio"); break;
                case 7: System.out.println("Julio"); break;
                case 8: System.out.println("Agosto"); break;
                case 9: System.out.println("Septiembre"); break;
                case 10: System.out.println("Octubre"); break;
                case 11: System.out.println("Noviembre"); break;
                case 12: System.out.println("Diciembre"); break;
                default: System.out.println("Error al leer el número"); break;
            }
        }else {
            System.out.println("Mes incorrecto");
        }*/

        /*String palabra_mes = "";
        System.out.print("Escribe un mes: "); palabra_mes = sc.next();

        switch (palabra_mes){
            case "Enero", "Febrero", "Marzo": System.out.println("Primer trimestre"); break;
            case "Abril", "Mayo", "Junio": System.out.println("Segundo trimestre"); break;
            case "Julio", "Agosto", "Septiembre": System.out.println("Tercer trimestre"); break;
            case "Octubre", "Noviembre", "Diciembre": System.out.println("Cuarto trimestre"); break;
            default: System.out.println("Ese mes no existe o pon la inicial con mayúscula"); break;
        }*/


        //operador ternario
        int num1 = 2;

        String texto = (num1 % 2 == 0) ? "Es par" : "Impar";

        System.out.println(texto);

        //programa que muestre con continue los primeros 50 numeros impares

        for (int i = 0; i < 51 ; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
