package herencia;

public class Coche {
	public static final MotorGasolina Motor = null;
	Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.arrancar();
    }
}
