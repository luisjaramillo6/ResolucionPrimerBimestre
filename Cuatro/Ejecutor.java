
package Cuatro;

import java.util.Scanner;


public class Ejecutor {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        try {
        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        String[] calificaciones = {"10", "15", "l"};
        Persona p = new Persona(nombre, apellido, calificaciones);
        System.out.println(p);

        } catch (Exception e) {
            System.err.printf("\nExcepcion: %s\n",e);
                System.out.println(
                        "Error, Debe introducir datos validos. Intente de nuevo.\n");
                scan.nextLine();
        }
    }
}