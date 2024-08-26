package herencia;

public class Main {
    public static void main(String[] args) {
        Coche cocheElectrico = new Coche(new MotorElectrico());
        cocheElectrico.arrancar();
        ((MotorElectrico) cocheElectrico.motor).recargar(); 

        Coche cocheGasolina = new Coche(new MotorGasolina());
        cocheGasolina.arrancar();
        ((MotorGasolina) cocheGasolina.motor).repostar();
    }

}
