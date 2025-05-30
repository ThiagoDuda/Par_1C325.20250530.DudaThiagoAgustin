package par_1c325.pkg20250530.dudathiagoagustin;

public class Exploracion extends Nave implements Explorar{
    private String tipoDeMision;

    public Exploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, String tipoDeMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoDeMision = tipoDeMision;
    }
    
    /**
     * Devuelve una representación en cadena de la nave.
     * @return Información textual del libro
     */
    @Override
    public String toString() {
        return "Exploracion[Nombre: "+ nombre + " | Capacidad de tripuilacion: "+ capacidadTripulacion + " | Anio de lanzamiento: " + anioLanzamiento + " | Tipo de mision: " + tipoDeMision + '}';
    }
    
    /**
     * Método que la exploracion de la nave.
     * Implementación del método definido por la interfaz Leible.
     */
    @Override
    public void iniciarExploracion() {
        System.out.println("Se ah iniciado correctamente la exploracion para la nave: " + nombre);
    }
}
