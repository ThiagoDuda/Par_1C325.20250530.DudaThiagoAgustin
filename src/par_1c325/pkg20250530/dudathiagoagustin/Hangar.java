package par_1c325.pkg20250530.dudathiagoagustin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hangar {
    private String nombre;
    private List<Nave> listaDeNaves;

    public Hangar(String nombre){
        this.nombre = nombre;
        this.listaDeNaves = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Recorre la lista de publicaciones
     * y valida si la publicacion que pasamos por parametro existe en la listaDeNaves del hangar
     * 
     * @param publicacion
     * @return true si existe, false si no existe
     */
    private boolean existeNave(Nave nave){
        return listaDeNaves.contains(nave);
    }
    
    /**
     * Devuelve si hay alguna publicacion en la listaDeNaves de Hangar
     * @return true si hay publicacion, false si no hay publicacion
     */
    private boolean hayNaves(){
        return !listaDeNaves.isEmpty();
    }
    
    /**
    * Agrega una publicacion a la lista de Nave del hangar
    * validando su existencia
    * 
    * @param nave
    * @return false si ya existe | true si se agrego con exito
    */
    public boolean agregarNave(Nave nave){
        if(existeNave(nave)) {
            System.out.println("---- ESTA NAVE YA EXISTE ----");
            return false;
        } else {
            listaDeNaves.add(nave);
            System.out.println("++++ NAVE INSERTADA CON EXITO ++++");
            return true;
        }
    }
    
     /**
     * Recorre toda la listaDeNaves del hangar
     * e imprime todos los elementos haciendo uso de su toString().
     */
    public void mostrarNaves(){
        for (Nave n: listaDeNaves) {
            System.out.println(n);
        }
    }
    
    /**
     * Explora todas las naves que implmenten la interfaz Explorar
     * En caso de que no implementen la interfaz da un aviso personalizado.
     */
    public void explorar(){
        for(Nave n: listaDeNaves) {
            if(n instanceof Explorar){
                ((Explorar) n).iniciarExploracion();
            }else {
                System.out.println("La nave " + n.nombre + " no se puede explorar ya que es " + n.getClass().getSimpleName());
            }
        }
    }
    
    // Comparable
    public void ordenarNaves(){
        if (hayNaves()) {
            listaDeNaves.sort(null);
            System.out.println("=== LISTA ORDENADA CON EXITO ===");
            mostrarNaves();
        } else {
            System.out.println("ERROR. No hay publicaciones.");
        }
    }
    
    // Comparator
    public void ordenarNaves(Comparator comparador){
        if (hayNaves()) {
            listaDeNaves.sort(comparador);
            System.out.println("=== LISTA ORDENADA CON EXITO ===");
            mostrarNaves();
        } else {
            System.out.println("ERROR. No hay publicaciones.");
        }
    }
    
}
