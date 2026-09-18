public class Moto extends Vehiculo{

    int motor;

    public Moto(int id, double precio, String color, int motor) {
        super(id, precio, color);
        this.motor = motor;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() + "c.c: " + getMotor();
    }
}
