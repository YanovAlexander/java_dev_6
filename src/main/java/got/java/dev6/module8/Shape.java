package got.java.dev6.module8;

public class Shape {
    private int length;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
