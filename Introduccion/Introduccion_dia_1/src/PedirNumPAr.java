import java.util.*;

public class PedirNumPAr {

    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        int numero;

        System.out.print("Escribe el número: "); numero = sc.nextInt();

        while(numero % 2 != 0){
            System.out.print("Escribe el número: "); numero = sc.nextInt();
        }
    }
}
