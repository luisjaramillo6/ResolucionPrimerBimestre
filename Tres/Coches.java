package Tres;

public class Coches extends Vehiculo {

    private double numero_pasajeros;

    public Coches(String matricula, String color, String marca, int dias_alquiler, double numero_pasajeros) {
        super(matricula, color, marca, dias_alquiler);
        this.numero_pasajeros = numero_pasajeros;
    }

    public double getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public void setNumero_pasajeros(double numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    public double obtener_precio_alquiler(){
    return 50 * getDias_alquiler() + 5 * getNumero_pasajeros();
    }
}
