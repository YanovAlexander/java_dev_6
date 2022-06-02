package got.java.dev6.module7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Pointer pointer = new Pointer(new Point(10), new Point(10), new String[]{"abc" , "cdr"});
        Point pointX = pointer.getPointX();
        pointX.setPoint(20);
        System.out.println(pointer.getPointX().getPoint());
        String[] strings = pointer.getStrings();
        strings[0] = "brbrbr";

        System.out.println(Arrays.toString(pointer.getStrings()));
    }
}
