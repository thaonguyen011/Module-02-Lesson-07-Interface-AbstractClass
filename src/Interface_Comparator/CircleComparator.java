package Interface_Comparator;

import java.util.Comparator;
import Interface_Comparable.Circle;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }

}
