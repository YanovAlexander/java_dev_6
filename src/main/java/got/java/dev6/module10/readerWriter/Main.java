package got.java.dev6.module10.readerWriter;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static String FILENAME = "/Users/alexyanov/Documents/my-projects/java_dev_6_examples/src/main/java/got/java/dev6/module10/module-test/Hello.txt";

    public static void main(String[] args) {

        try(FileReader reader = new FileReader(FILENAME)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(FILENAME, true)){
            writer.write(System.lineSeparator() + " Add new line");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //BUFFERED
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILENAME, true))){
            bufferedWriter.newLine();
            bufferedWriter.write("Hello from buffered writer");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("READER");
        try(BufferedReader read = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
