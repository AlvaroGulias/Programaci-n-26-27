public class Ejercicio3_OperadoresAritmeticos {

    static void main(String[] args) {

        //1. Multiplicar 2,2 * 1,0 y al resultado sumarle 5,0. Guardar el resultado en un identificador llamado impuesto. Visualizar el resultado.

        double impuesto = (2.2 * 1.0) + 5.0;
        System.out.println(impuesto);

        //2. Definir una variable, impuesto2 que recoja el resultado de la expresión aritmética siguiente: a la división entera de 12 entre 2, sumarle -8. Visualizar el resultado.

        int impuesto2 = (12 / 2) + (-8);
        System.out.println(impuesto2);

        //3. Definir una variable cociente y otra resto, que recoja el cociente entero y el resto, de dividir 16 entre 3. Visualiza el resultado. Después define una variable que llamaremos cociente_decimal, que recoja el cociente con decimales.

        int cociente, resto;
        double cociente_decimal;

        resto = 16 % 3;
        cociente = 16 / 3;
        cociente_decimal = 16 / 3D;
        System.out.println("Resto: " + resto + " Cociente: " + cociente + " Cociente con decimal: " + cociente_decimal);

        //4. Asigna a una variable nueve, el valor 9. Haz un programa que defina una variable postIncremento, que tome el valor que tiene nueve y que incremente en uno la variable nueve.

        int nueve = 9;
        int postIncremento = nueve++;
        System.out.println("Post incremento: " + postIncremento);

        //5. Define una variable preIncremento, que tome incrementado en 1, el valor de nueve, y esta variable acabe también incrementando en 1 su valor. Visualiza resultados.

        int preIncremento = ++nueve;
        System.out.println("Pre incremento: " + preIncremento);

        //6. Define una variable postDecremento que tome el valor de nueve y decremente nueve en 1. Visualiza resultados.

        int postDecremento = nueve--;
        System.out.println("Post decremento: " + postDecremento);

        //7. Define una variable preDecremento, que tome decrementando en 1 el valor de nueve y esta variable acabe también decrementada en 1.

        int preDecremento = --nueve;
        System.out.println("Pre decremento: " + preDecremento);
    }

}
