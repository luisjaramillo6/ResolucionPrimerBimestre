package Dos;

public class Ejecutor {

    public static void main(String[] args) {
        
        Garante g1 = new Garante("Juan", "Alcacer", 900);
        Garante g2 = new Garante("Jose", "Henandez", 750);
        Garante g3 = new Garante("Manuel", "Perez", 1050);

        PrestamoAutomovil pa1 = new PrestamoAutomovil("Luis", 450.00, 25000, 15.5, 4, g1, "Todo terreno", "Toyota", g2);
        System.out.println("-------------------PRESTAMO AUTOMOVIL-----------------------------------");
        System.out.println("-----------------------PRESTAMO 1---------------------------------------");
        System.out.println(pa1);

        PrestamoAutomovil pa2 = new PrestamoAutomovil("Ivan", 600.00, 20000, 15.5, 2, g1, "Auto", "Chevrolet", g3);
        System.out.println("-----------------------PRESTAMO 2-------------------------------");
        System.out.println(pa2);

        PrestamoEducativo pe1 = new PrestamoEducativo("Rosa", 700.00, 15000, 15.5, 1, g1, "Bachiller", "Inmaculada", g2, g3);
        System.out.println("-------------------PRESTAMO EDUCATIVO-----------------------------------");
        System.out.println("-----------------------PRESTAMO 1---------------------------------------");
        System.out.println(pe1);

        PrestamoEducativo pe2 = new PrestamoEducativo("Maria", 900.00, 35000, 15.5, 5, g1, "Superiores", "Daniel Alvarez", g2, g3);
        System.out.println("-------------------PRESTAMO EDUCATIVO-----------------------------------");
        System.out.println("-----------------------PRESTAMO 2---------------------------------------");
        System.out.println(pe2);

        PrestamoEducativo pe3 = new PrestamoEducativo("Rosa", 450.00, 10000, 15.5, 3, g1, "Superiores", "Bernardo Valdiviezo", g2, g3);
        System.out.println("-------------------PRESTAMO EDUCATIVO-----------------------------------");
        System.out.println("-----------------------PRESTAMO 3---------------------------------------");
        System.out.println(pe3);

        
    }
}
