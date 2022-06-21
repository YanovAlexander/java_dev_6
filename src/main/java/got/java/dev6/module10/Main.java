package got.java.dev6.module10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    private static String filename = "/Users/alexyanov/Documents/my-projects/java_dev_6_examples/src/main/java/got/java/dev6/module10/module-test/Hello.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(filename);

        if (!file.exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
            System.out.println("Directories created = " + mkdirs + " for file " + filename);
        }

        boolean newFile = file.createNewFile();
        System.out.println("File created " + newFile);

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename, true))) {
            String hello = "Hello World";
            out.write(hello.getBytes());
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
