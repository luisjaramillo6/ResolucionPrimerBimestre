
package Uno;

import java.util.Scanner;


public class Ejecutor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        int control;
        String aux;
        
        while (bandera) {
            System.out.println("\nIngrese el NOMBRE del alumno:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el APELLIDO del alumno:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el NOMBRE del docente de Programacion");
            String d_pro_n = scanner.nextLine();
            System.out.println("Ingrese el APELLIDO del docente de Programacion");
            String d_pro_a = scanner.nextLine();
            System.out.println("Ingrese el TITULO del docente de Programacion");
            String d_pro_t = scanner.nextLine();
            System.out.println("Ingrese el NOMBRE del docente de Base de datos");
            String d_base_n = scanner.nextLine();
            System.out.println("Ingrese el APELLIDO del docente de Base de datos");
            String d_base_a = scanner.nextLine();
            System.out.println("Ingrese el TITULO del docente de Base de datos");
            String d_base_t = scanner.nextLine();
            
            Docente d1 = new Docente();
            Docente d2 = new Docente();
            
            Alumno a = new Alumno();
            a.setNombre(nombre);
            a.setApellido(apellido);
            d1.setNombre(d_pro_n);
            d1.setApellido(d_pro_a);
            d1.setTitulo(d_pro_t);
            d2.setNombre(d_base_n);
            d2.setApellido(d_base_a);
            d2.setTitulo(d_base_t);
            
      
            aux = String.format("\t- Estudiante - \nNombre: %s | Apellido: %s\n\t- Docente Programacion -\nNombre: %s | Apellido: %s | Titulo: %s\n\t- Docente Base de Datos -\nNombre: %s | Apellido: %s | Titulo:", 
                    a.getNombre(),a.getApellido(), d1.getNombre(), d1.getApellido(), d1.getTitulo(), d2.getNombre(), d2.getApellido(), d2.getTitulo());
            
            System.out.println("Desea ingresar mas alumno:\n[1]SI\n[2]NO");
            control = scanner.nextInt();
            if (control != 1) {
                bandera = false;
            }
            scanner.nextLine();
            System.out.println(aux);
        }
     
    }
}
