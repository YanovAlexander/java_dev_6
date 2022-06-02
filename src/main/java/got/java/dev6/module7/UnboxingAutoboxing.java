package got.java.dev6.module7;

public class UnboxingAutoboxing {
    public static void main(String[] args) {
        String number = new String("10a");
        try {
            Integer intNumber = Integer.parseInt(number);
            System.out.println(intNumber);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong number");
        }
    }
}
