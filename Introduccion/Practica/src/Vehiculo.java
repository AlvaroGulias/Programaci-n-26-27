public class Vehiculo {

    int id;
    double precio;
    String color;

    public Vehiculo(int id, double precio, String color) {
        this.id = id;
        this.precio = precio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Id del Vehículo: " + getId() + ", Precio: " + getPrecio() + "€, Color: " + getColor() + ", ";
    }
}
