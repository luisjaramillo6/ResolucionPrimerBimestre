package Tres;

public class Camiones extends Vehiculo {

    private double toneladas;

    public Camiones(String matricula, String color, String marca, int dias_alquiler, double toneladas) {
        super(matricula, color, marca, dias_alquiler);
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public double obtener_precio_alquiler(){
    return 50 * getDias_alquiler() + 20 * getToneladas();
    }
}
