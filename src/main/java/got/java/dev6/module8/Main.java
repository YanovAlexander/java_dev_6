package got.java.dev6.module8;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Quad quad = new Quad();
        quad.setHeight(100);
        quad.setLength(100);

        System.out.println(quad);
        String name = "java";
        final String s = name.toLowerCase();
        System.out.println(System.lineSeparator());
        final String localString = name.toLowerCase();
        System.out.println(localString);

        String name2 = "java";
        final String localString2 = name2.toLowerCase();
        System.out.println(localString2);

        System.out.println(localString.equals(localString2));
    }
}
