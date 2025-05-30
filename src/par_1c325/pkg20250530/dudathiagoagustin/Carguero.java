package par_1c325.pkg20250530.dudathiagoagustin;

public class Carguero extends Nave implements Explorar{
    private int capacidadDeCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadDeCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadDeCarga = capacidadDeCarga;
    }
    
    /**
     * Devuelve una representación en cadena de la nave.
     * @return Información textual del libro
     */
    @Override
    public String toString() {
        return "Carguero[Nombre: "+ nombre + " | Capacidad de tripuilacion: "+ capacidadTripulacion + " | Anio de lanzamiento: " + anioLanzamiento + " | Capacidad de carga: " + capacidadDeCarga + ']';
    }
    
    /**
     * Método que la exploracion de la nave.
     * Implementación del método definido por la interfaz Leible.
     */
    @Override
    public void iniciarExploracion(){
        System.out.println("Se ah iniciado correctamente la exploracion para la nave: " + nombre);
    } 
}
