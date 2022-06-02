package got.java.dev6.mothod9;

public class GenericClass {
    public <N extends Developer> void printNumbers(N[] array) {
        for (N item : array) {
            System.out.println(item.getLastName());
            System.out.println(item.getName());
            System.out.println(item);
        }
    }
}
