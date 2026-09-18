import java.util.Scanner;

public class GestorVehiculos {

    Scanner sc = new Scanner(System.in);

    public Vehiculo meterdatosVehiculo(){

    }

    public String verificacion(){
        String tipoVehiculo = "";

        do{
            System.out.println("¿Qué vehiculo quieres añadir?"); tipoVehiculo = sc.next();
        }while(!tipoVehiculo.equalsIgnoreCase("coche") || !tipoVehiculo.equalsIgnoreCase("moto") || !tipoVehiculo.equalsIgnoreCase("camion"));

        return tipoVehiculo;
    }
}
