package Dos;

public class PrestamoAutomovil extends Prestamo {

    private String tipo_vehiculo;
    private String marca_vehiculo;
    private Garante garante2;

    public PrestamoAutomovil(String nombre_debeneficiario, double sueldo, double monto_prstamo, double interes, int tiempo_prestamo, Garante garante_1, String tipo_vehiculo, String marca_vehiculo, Garante garante2) {
        super(nombre_debeneficiario, sueldo, monto_prstamo, interes, tiempo_prestamo, garante_1);
        setTipo_vehiculo(tipo_vehiculo);
        setMarca_vehiculo(marca_vehiculo);
        setGarante2(garante2);
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }
    
    
    @Override
    public String toString(){
    
        return String.format("%s | Tipo Vehiculo: %s | Marca vehiculo: %s\nGarante 2:\nNombre: %s\nApellido: %s\nSueldo: %.2f\n", super.toString(), getTipo_vehiculo(),getMarca_vehiculo(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo());
    }
    

}
