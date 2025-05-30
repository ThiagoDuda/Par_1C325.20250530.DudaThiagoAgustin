package par_1c325.pkg20250530.dudathiagoagustin;

public abstract class Nave implements Comparable<Nave>{
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases para 
     * representar la publicación como una cadena de texto.
     * @return La representación en cadena de texto de la nave
     */
    @Override
    public abstract String toString();
    
    /**
     * Compara dos Naves para determinar si son iguales.
     * Las naves son consideradas iguales si tienen el mismo nombre
     * (ignorando mayúsculas/minúsculas) y el mismo año de nazamiento.
     * @param obj Objeto con el cual se compara la publicación
     * @return true si son iguales, false si no lo son
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Nave n = (Nave) obj;
        return this.nombre.equalsIgnoreCase(n.nombre) && this.anioLanzamiento == n.anioLanzamiento;
    }
    
    /**
     * Compara dos naves por su nombre.
     * @param n La otra nave con la que se compara
     * @return Un valor negativo, cero o positivo según el año de la nave
     */
    @Override
    public int compareTo(Nave n){
        return this.nombre.compareTo(n.nombre);
    }
}
