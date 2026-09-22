import java.util.Scanner;

public class GestorVehiculos {

    Scanner sc = new Scanner(System.in);



    public String verificacion(){
        String tipoVehiculo = "";

        do{
            System.out.println("¿Qué vehiculo quieres añadir?"); tipoVehiculo = sc.next();
        }while(!tipoVehiculo.equalsIgnoreCase("coche") || !tipoVehiculo.equalsIgnoreCase("moto") || !tipoVehiculo.equalsIgnoreCase("camion"));

        return tipoVehiculo;
    }

    public Vehiculo meterdatosVehiculo(){
        int id, motor;
        double precio, peso, kilometraje;
        String color;

        System.out.println("Id del coche: "); id = sc.nextInt();
        System.out.println("Precio del coche: "); precio = sc.nextDouble();
        System.out.println("Color del coche: "); color = sc.next();

        switch (verificacion()){
            case "coche":
                System.out.println("Kilometraje del coche: "); kilometraje = sc.nextDouble(); break;
            case "moto":
                System.out.println("");
        }
    }
}
