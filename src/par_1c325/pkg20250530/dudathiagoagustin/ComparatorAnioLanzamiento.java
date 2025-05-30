package par_1c325.pkg20250530.dudathiagoagustin;

import java.util.Comparator;

public class ComparatorAnioLanzamiento implements Comparator<Nave>{
    @Override
    public int compare(Nave n1, Nave n2) {
        return Integer.compare(n2.getAnioLanzamiento(), n1.getAnioLanzamiento());
    }
    
}
