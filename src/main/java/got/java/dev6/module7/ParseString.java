package got.java.dev6.module7;

public class ParseString {

    public static void main(StringExample[] args) {
        String s = "abccccbb";
        final String s1 = s.replaceAll("(.)(?=.*?\\1)", "");
        System.out.println(s1);
    }
}
