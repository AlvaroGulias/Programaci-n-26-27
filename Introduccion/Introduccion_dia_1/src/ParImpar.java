import java.util.*;

public class ParImpar
{
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        int numero;

        System.out.print("Escribe el número: "); numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
}
