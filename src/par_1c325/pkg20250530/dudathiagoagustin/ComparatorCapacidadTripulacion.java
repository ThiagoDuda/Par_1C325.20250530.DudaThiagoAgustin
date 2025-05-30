package par_1c325.pkg20250530.dudathiagoagustin;

import java.util.Comparator;

public class ComparatorCapacidadTripulacion implements Comparator<Nave>{
    @Override
    public int compare(Nave n1, Nave n2) {
        return Integer.compare(n2.getCapacidadTripulacion(), n1.getCapacidadTripulacion());
    }
}
