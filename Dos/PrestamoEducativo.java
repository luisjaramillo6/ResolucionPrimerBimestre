package Dos;

public class PrestamoEducativo extends Prestamo {

    private String nivel_estudio;
    private String nombre_Centro;
    private Garante garante2;
    private Garante garante3;

    public PrestamoEducativo(String nombre_debeneficiario, double sueldo, double monto_prstamo, double interes, int tiempo_prestamo, Garante garante1, String nivel_estudio, String nombre_Centro, Garante garante2, Garante garante3) {
        super(nombre_debeneficiario, sueldo, monto_prstamo, interes, tiempo_prestamo, garante1);
        setNivel_estudio(nivel_estudio);
        setNombre_Centro(nombre_Centro);
        setGarante2(garante2);
        setGarante3(garante3);
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public String getNombre_Centro() {
        return nombre_Centro;
    }

    public void setNombre_Centro(String nombre_Centro) {
        this.nombre_Centro = nombre_Centro;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante garante3) {
        this.garante3 = garante3;
    }

    @Override
    public String toString(){
    
        return String.format("%s | Nivel de Estudio: %s | Centro Educativo: %s\nGarante 2:\nNombre: %s\nApellido: %s\nSueldo: %.2f\nGarante 3:\nNombre: %s\nApellido: %s\nSueldo: %.2f\n", super.toString(),getNivel_estudio(),getNombre_Centro(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo(),getGarante3().getNombre(), getGarante3().getApellido(), getGarante3().getSueldo());
    }
    
}


