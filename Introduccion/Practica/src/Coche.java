public class Coche extends Vehiculo{

    double kilometraje;

    public Coche(int id, double precio, String color, double kilometraje) {
        super(id, precio, color);
        this.kilometraje = kilometraje;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return super.toString() + "Kilometraje del coche " + getKilometraje();
    }
}
