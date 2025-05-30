package par_1c325.pkg20250530.dudathiagoagustin;

public class CruceroEstelar extends Nave{
    private int cantidadDePasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadDePasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    /**
     * Devuelve una representación en cadena de la nave.
     * @return Información textual del libro
     */
    @Override
    public String toString() {
        return "CruceroEstelar[Nombre: "+ nombre + " | Capacidad de tripuilacion: "+ capacidadTripulacion + " | Anio de lanzamiento: " + anioLanzamiento + " | Cantidad de pasajeros " + cantidadDePasajeros + ']';
    }   
}
