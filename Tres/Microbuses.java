package Tres;

public class Microbuses extends Vehiculo {

    private int numero_rutas;

    public Microbuses(String matricula, String color, String marca, int dias_alquiler, int numero_rutas) {
        super(matricula, color, marca, dias_alquiler);
        this.numero_rutas = numero_rutas;
    }

    public int getNumero_rutas() {
        return numero_rutas;
    }

    public void setNumero_rutas(int numero_rutas) {
        this.numero_rutas = numero_rutas;
    }

    public double obtener_precio_alquiler(){
    return 50 * getDias_alquiler() + 10 * getNumero_rutas();
    }
}
