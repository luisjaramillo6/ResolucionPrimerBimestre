package Tres;

public class Furgoneta extends Vehiculo {

    public Furgoneta(String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
    }
    
    public double obtener_precio_alquiler(){
    return 50 * getDias_alquiler() + 100;
    }

   
}
