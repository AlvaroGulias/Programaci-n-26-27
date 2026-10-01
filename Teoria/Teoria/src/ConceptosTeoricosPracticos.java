import java.util.EnumMap;

public class ConceptosTeoricosPracticos {

    /*
         Java distingue de masyusculas y minusculas
        String != string; numero != numero
        --------------Identificadores--------------

        * Son los nombres de los distintos elementos del codigo
        * Tienen que ser identificativos
        * Deben de comenzar por una letra, _ o $
        * Nunca deben de comenzar por un numero
        * Nunca debe de incluir espacios en blanco
        * Nunca puede ser palabras reservadas (Son aquellas que tienen un significado especial para el lenguaje de programacion)
        * El identificador de la calse siempre empieza por mayuscula
        * el nombre de una funcion siempre empieza por letra minusucla
        * El nombre de una variable comienza con letra minuscula y suelen ser sustantivos
        * El nombre de una constante siempre se escribe en masyusculas y tambien suele ser sustantivos
        *
        *  --------------Tipos de datos--------------
        * int = numero entero
        * String = cadena de texto
        * float y double = numeros con decimales
        * boolean = true o false
        * char = una letra
        * long = un numero muy largo
        * */

    static void main(String[] args) {
        boolean esPar = false;
        char letra = 'a';
        int numeroEntero = 22;
        String texto = "esto es un texto";
        long numeroLargoo = 90999L;

        short sueldo = 1980;
        short complemeto =  500;
        short finald = (short) (sueldo  + complemeto);

        int PRECIO = 3;

        int contador = 1;
        int actualizar_contador = contador++;
        System.out.println(actualizar_contador);

    }
}
