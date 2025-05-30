package par_1c325.pkg20250530.dudathiagoagustin;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Hangar hangar1 = new Hangar("Hangar Thiago");
        
        int opcion;
        
        do {
            System.out.println("====== MENU =======");
            System.out.println("1) Agregar Nave.");
            System.out.println("2) Mostar Naves");
            System.out.println("3) Iniciar mision de exploracion");
            System.out.println("4) Mostrar naves ordenadas por nombre");
            System.out.println("5) Mostrar naves ordenadas por anio de lanzamiento");
            System.out.println("6) Mostrar naves ordenadas por capacidad de tripulacion");
            System.out.println("7) Salir");
            opcion = pedirEntero("Ingrese una opcion: ");
            
            switch(opcion) {
                case 1 -> agregarNave(hangar1);
                case 2 -> hangar1.mostrarNaves();
                case 3 -> hangar1.explorar();
                case 4 -> hangar1.ordenarNaves();
                case 5 -> hangar1.ordenarNaves(new ComparatorAnioLanzamiento());
                case 6 -> hangar1.ordenarNaves(new ComparatorCapacidadTripulacion());
                case 7 -> System.out.println("Cerrando hangar...");
                default -> System.out.println("[ERROR] Opcion invalida.");
            }
            
        } while(opcion != 7);
    }
    
    public static int pedirEntero(String mensaje){
        int entero = 0;
        do{
            System.out.print(mensaje);
             entero = sc.nextInt();
        } while (entero <= 0);
        return entero;
    }
    
    public static String pedirString(String mensaje) {
        String cadena = "";
        do {
            System.out.print(mensaje);
            cadena = sc.nextLine();
        } while ("".equals(cadena));
        return cadena;
    }
    
    public static double solicitarDouble(String mensaje){
        System.out.print(mensaje);
        return sc.nextDouble();
    }
    
    public static boolean pedirBooleano(String pregunta) {
        while(true){
        String respuesta = pedirString(pregunta + " (si/no): ").trim().toLowerCase();
            if (respuesta.equals("si")) {
                return true;
            } else if(respuesta.equals("no")) {
                return false;
            } else {
                System.out.println("[ERROR] Debes ingresar 'si' o 'no'.");
            }
        }
    }
    
    public static void agregarNave(Hangar h){
        while (true){
            System.out.println("======== AGREGAR NAVE ========");
            System.out.println("1) Exploracion");
            System.out.println("2) Carguero");
            System.out.println("3) Crucero Estelar");
            
            int opcionNave = pedirEntero("Ingrese una opcion: ");
            
            switch (opcionNave){
                case 1 -> ingresarExploracion(h);
                case 2 -> ingresarCarguero(h);
                case 3 -> ingresarCrucero(h);
                default -> {
                    System.out.println("ERROR. Opcion invalida");
                    continue;
                }
            } break;
        }
        
    }
    
    public static void ingresarExploracion(Hangar h){
        sc.nextLine();
        String nombre = pedirString("Ingresar el nombre de la nave: ");
        int capacidadTripulacion = pedirEntero("Ingresar la cantidad de tripulacion: ");
        int anioLanzamiento = pedirEntero("Ingresar el anio de lanzamiento: ");
        
        String tipoDeMision = "";
        
        while (true){
            System.out.println("======== TIPO DE MISIONES ========");
            System.out.println("1) Cartografia");
            System.out.println("2) Investigacion");
            System.out.println("3) Contacto");
            
            int opcionMision = pedirEntero("Ingrese una opcion: ");
            
            switch (opcionMision) {
                case 1 -> tipoDeMision = "CARTOGRAFIA";
                case 2 -> tipoDeMision = "INVESTIGACION";
                case 3 -> tipoDeMision = "CONTACTO";
                default -> {
                    System.out.println("ERROR. Opcion invalida");
                    continue;
                }
            } break;
        }
        h.agregarNave(new Exploracion(nombre, capacidadTripulacion, anioLanzamiento, tipoDeMision));
    }
    
    public static void ingresarCarguero(Hangar h) {
        sc.nextLine();
        String nombre = pedirString("Ingresar el nombre de la nave: ");
        int capacidadTripulacion = pedirEntero("Ingresar la cantidad de tripulacion: ");
        int anioLanzamiento = pedirEntero("Ingresar el anio de lanzamiento: ");
        
        int cantidadDeCarga;
        do{
            cantidadDeCarga = pedirEntero("Ingresar la cantidad de carga (100 - 500): ");
            if (cantidadDeCarga < 100){
                cantidadDeCarga = 100;
            }
        } while (cantidadDeCarga > 500);
        
        h.agregarNave(new Carguero(nombre, capacidadTripulacion, anioLanzamiento, cantidadDeCarga));
    }
    
    public static void ingresarCrucero(Hangar h){
        sc.nextLine();
        String nombre = pedirString("Ingresar el nombre de la nave: ");
        int capacidadTripulacion = pedirEntero("Ingresar la cantidad de tripulacion: ");
        int anioLanzamiento = pedirEntero("Ingresar el anio de lanzamiento: ");
        int cantidadDePasajaeros = pedirEntero("Ingresar la cantidad de pasajeros: ");
        
        h.agregarNave(new CruceroEstelar(nombre, capacidadTripulacion, anioLanzamiento, cantidadDePasajaeros));
    }
}   

