package got.java.dev6.module7;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");
        String str2 = "Hello";

        System.out.println(str == str2);

        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(Arrays.toString(str2.getBytes()));
        System.out.println(str.equals(str1));

        byte[] bytes = {72, 101, 108, 108};
        final String stringFromBytes = new String(bytes);

        System.out.println(stringFromBytes);

        System.out.println(Arrays.toString(stringFromBytes.toCharArray()));
        for (char c : stringFromBytes.toCharArray()) {
            System.out.println(c);
        }

        int counter = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            counter = counter + 1;
            sb.append(counter);
        }

        System.out.println(sb);

    }
}
