public class Ejercicio5_OperadoresComparacion {

    static void main(String[] args) {
        int edadJuan = 6, edadPedro = 6, edadJulio = 21, contador = 14;
        double hypotenusa = 206.73, cateto1 = 13.2, cateto2 = 5.7;
        boolean falso = false, verdadero = true;

        //1. Es true que Juan es menor de edad.
        if(edadJuan < 18){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //2. Es true que Juan tiene la misma edad que Pedro.
        if(edadJuan == edadPedro){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //3. Es true que Julio tiene más edad que Pedro.
        if(edadJulio > edadPedro){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //4. Es false que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado.
        if(hypotenusa == ((cateto1 * cateto1) + (cateto2 * cateto2))){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //5. Es true que el cateto1 es mayor que el cateto2.
        if(cateto1 > cateto2){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //6. Es false que contador es igual a 8.
        if (contador == 8){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }

        //7. Es true que contador es distinto a 8.
        if (contador != 8){
            System.out.println(verdadero);
        }else{
            System.out.println(falso);
        }
    }
}
