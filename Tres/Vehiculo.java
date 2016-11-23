
package Tres;

public abstract class Vehiculo {

    private String matricula;
    private String color;
    private String marca;
    private int dias_alquiler;

    public Vehiculo(String matricula, String color, String marca, int dias_alquiler) {
        setMatricula (matricula);
        setColor (color);
        setMarca (marca);
        setDias_alquiler (dias_alquiler);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    
    public String toString(){
        return  String.format("\n =============================\n- Matricula: %s\n- Color: %s\n- Marca: %s\n- Dias de Alquiler: %d\n", 
                getMatricula(),getColor(),getMarca(),getDias_alquiler());
    }
    
    public abstract double obtener_precio_alquiler();
}
