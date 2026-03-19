package guru.qa;

import java.awt.*;

public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x,y);
        this.color = color;
    }

    public Point asPoint() {
        return point ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        ColorPoint that = (ColorPoint) o;
        return point.equals(that.point) && color == that.color;
    }
}
