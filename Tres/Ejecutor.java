
package Tres;


public class Ejecutor {
    public static void main(String[] args) {
        
        Camiones c = new Camiones("lbj-123", "Rojo", "Toyota",5, 1);
        Coches ch = new Coches("lkj-659", "Blanco", "Hyundai",4, 4);
        Microbuses mb = new Microbuses("lbb-175", "Negro", "Chevrolet",10, 10);
        Furgoneta fg = new Furgoneta("lca-772", "Gris", "Kia",2);
        
        
        Vehiculo vehiculo [] = new Vehiculo[4];
        
        vehiculo[0] = c;
        vehiculo[1] = ch;
        vehiculo[2] = mb;
        vehiculo[3] = fg;
        
        for (Vehiculo vehiculoactual : vehiculo){
            System.out.println(vehiculoactual);
            System.out.printf(" VALOR TOTAL DEl ALQUILER: %.2f$\n", vehiculoactual.obtener_precio_alquiler());
            
        }
                
    }
}
