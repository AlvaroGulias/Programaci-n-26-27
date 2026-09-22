import java.util.*;

public class Suma {

    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        int numero1, numero2;

        System.out.print("Introduce el numero 1: "); numero1 = sc.nextInt();
        System.out.print("Introduce el numero 2: "); numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

    }
}
