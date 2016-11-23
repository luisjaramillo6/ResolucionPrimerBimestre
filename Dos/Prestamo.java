package Dos;

public class Prestamo {

    private String nombre_debeneficiario;
    private double sueldo;
    private double monto_prstamo;
    private double interes;
    private int tiempo_prestamo;
    private Garante garante1;

    public Prestamo(String nombre_debeneficiario, double sueldo, double monto_prstamo, double interes, int tiempo_prestamo, Garante garante1) {
        setNombre_debeneficiario(nombre_debeneficiario);
        setSueldo(sueldo);
        setMonto_prstamo(monto_prstamo);
        setInteres(interes);
        setTiempo_prestamo(tiempo_prestamo);
        setGarante1(garante1);
    }

    public String getNombre_debeneficiario() {
        return nombre_debeneficiario;
    }

    public void setNombre_debeneficiario(String nombre_debeneficiario) {
        this.nombre_debeneficiario = nombre_debeneficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMonto_prstamo() {
        return monto_prstamo;
    }

    public void setMonto_prstamo(double monto_prstamo) {
        this.monto_prstamo = monto_prstamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempo_prestamo() {
        return tiempo_prestamo;
    }

    public void setTiempo_prestamo(int tiempo_prestamo) {
        this.tiempo_prestamo = tiempo_prestamo;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }

    public double valor_Prestamo(double monto_prestamo, double interes) {
        double valor_p = monto_prestamo * interes;
        double valor_t = monto_prestamo + valor_p;
        return valor_t;

    }

    @Override
    public String toString() {
        return String.format("Beneficiario: %s | Sueldo:%f | Monto del Prestamo: %f\nInteres: %f | Tiempo Prestamo(años): %d\nGarante 1:\nNombre: %s\nApellido: %s\nSueldo: %f\nValor Final Prestamo (interes incluido): %.2f", 
                getNombre_debeneficiario(), getSueldo(), getMonto_prstamo(), getInteres(), getTiempo_prestamo(), getGarante1().getNombre(), getGarante1().getApellido(), getGarante1().getSueldo(),valor_Prestamo(monto_prstamo, interes));
    }

}
