package es.iesmontenaranco.programacion;

import java.util.Scanner;

public class ExamenEvaluacion1 {
    //Alvaro Gulias Alvarez

    static  Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        tratarMenu();
    }

    public static void tratarMenu(){

        byte introducirOpcionMenu = 0;





        do{


            do{
                mostrarMenu();
                System.out.println("Introduzca una opción: ");
                introducirOpcionMenu = sc.nextByte();

                if(introducirOpcionMenu <= 0 || introducirOpcionMenu >= 5 ){
                    System.out.println("Debe introducir una opción válida del menú");
                }

            }while(introducirOpcionMenu <= 0 || introducirOpcionMenu >= 5);


            switch (introducirOpcionMenu){
                case 1:
                    int numeroBase, numeroExponente;
                    System.out.println("Introduzca un número para la base: ");
                    numeroBase = sc.nextInt();
                    System.out.println("Introduzca un número para el exponente: ");
                    numeroExponente = sc.nextInt();
                    calcularPotencia(numeroBase, numeroExponente);
                    break;
                case 2:
                    if(validarPassword()){
                        System.out.println("La contraseña es válida");
                    }
                    break;
                case 3:
                    mostrarAsciiP();
                    break;
                case 4:
                    System.out.println("FIN");
                    break;

            }
        }while(introducirOpcionMenu != 4);
    }

    public static void mostrarMenu(){
        System.out.println("-------------MENU-------------\n1.- Calcular la potencia\n2.- Validar contraseña\n3.- Código Ascii de P\n4.- Salir");
    }

    public static void calcularPotencia(int base, int exponente){
        int resultado = base;

        if(exponente == 0){
            resultado = 1;
        }else{

            for (int i = 1; i < exponente; i++) {
                resultado *= base;
            }
        }

        System.out.println("El resultado de la base " + base + " elevada al exponente " + exponente + " es: " + resultado);
    }

    public static boolean validarPassword(){
        String password = "";
        byte contador = 0;
        boolean validacionContrasena = false;
        String CONTRASENA = "Evaluacion1";

        do {

            System.out.println("Escribe la contraseña: (intento " + (contador + 1) + ") ");
            password = sc.next();

            if (password.equals(CONTRASENA)) {
                validacionContrasena = true;
            } else {
                contador++;
            }

            if(contador == 3){
                validacionContrasena = true;
            }

        }while (!validacionContrasena);

        if (contador == 3){
            return false;
        }else{
            return true;
        }
    }

    public static void mostrarAsciiP(){
        char LETRA = 'P';
        int VALOR = 80;
        System.out.println("El código ascii de " + LETRA + " es: " + VALOR);
    }

}
