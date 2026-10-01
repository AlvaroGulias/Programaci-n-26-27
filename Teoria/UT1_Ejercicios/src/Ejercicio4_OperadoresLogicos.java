public class Ejercicio4_OperadoresLogicos {

    static void main(String[] args) {

        // 1. Definir la variable frio inicializada a false. El programa debe imprimir la variable frio, y nos debe salir por pantalla true.

        boolean frio = false;
        System.out.println(!frio);

        //2. Imprimir la variable oportunidad, y que nos salga el valor true, sabiendo que es la combinación de tres variables, bueno, bonito y barato, que debes declarar e inicializar previamente (oportunidad debe tener la sintaxis siguiente: oportunidad = bueno [operador] bonito [operador] barato. Debes colocar los operadores binarios apropiados).

        boolean oportunidad, bueno = true, bonito = true, barato = true;
        oportunidad = bueno && bonito && barato;
        System.out.println(oportunidad);

        //3. Imprimir la variable mojado y que nos salga true, sabiendo que es la combinación de dos variables, llueve y riego, esta última inicializada a false (mojado debe tener la sintaxis siguiente: mojado = llueve [operador] riego. Debes colocar el operador binario apropiado).

        boolean mojado, llueve = true, riego = false;
        mojado = llueve || riego;
        System.out.println(mojado);
    }
}
