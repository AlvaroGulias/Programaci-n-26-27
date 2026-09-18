public class Camion extends Vehiculo{

    double peso;

    public Camion(int id, double precio, String color, double peso) {
        super(id, precio, color);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "peso: " + getPeso();
    }
}
