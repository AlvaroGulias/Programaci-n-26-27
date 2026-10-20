package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import java.util.Scanner;

public class Ejercicio11 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio11 ej = new Ejercicio11();
        ej.run();
    }

    public void run(){
        double precio_producto = introducirPrecioProducto();
        double caclular_precio = calcularPrecioIva(precio_producto);
        imprimirResultados(precio_producto, caclular_precio);
    }

    public double introducirPrecioProducto(){
        double precio_producto = 0;
        System.out.println("Introduce el precio del producto: "); precio_producto = sc.nextDouble();
        return precio_producto;
    }

    public double calcularPrecioIva(double precio_producto){
        double IVA = 0.21;
        return (precio_producto * IVA) + precio_producto;
    }

    public void imprimirResultados(double precio, double precio_con_iva){
        System.out.println("El precio sin IVA es: " + precio);
        System.out.println("El precio con IVA es: " + precio_con_iva);
    }
}
