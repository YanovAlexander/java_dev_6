package got.java.dev6.module8.interfaces;

public class Duck extends Bird{
    private int weight;

    public Duck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "color='" + super.getColor() + '\'' +
                ", weight=" + weight +
                '}';
    }
}
