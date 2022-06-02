package got.java.dev6.module7;

import java.util.Arrays;
import java.util.Objects;

public final class Pointer {
    private final Point pointX;
    private final Point pointY;
    private final String[] strings;

    public Pointer(Point pointX, Point pointY, String[] strings) {
        this.pointY = pointY;
        this.pointX = pointX;
        this.strings = strings;
    }

    public Point getPointX() {
        return new Point(pointX.getPoint());
    }

    public Point getPointY() {
        return new Point(pointY.getPoint());
    }

    public String[] getStrings() {
        return Arrays.copyOf(strings, strings.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pointer pointer = (Pointer) o;
        return pointX.equals(pointer.pointX) && pointY.equals(pointer.pointY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}
