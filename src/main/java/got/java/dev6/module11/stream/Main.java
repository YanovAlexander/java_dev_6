package got.java.dev6.module11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("oleksandr");
        users.add("oleksandr");
        users.add("ivan");
        users.add("petro");
        users.add("stanislav");

        List<String> matchedList = new ArrayList<>();
        for (String user : users) {
            if (user.equals("oleksandr")) {
                matchedList.add(user);
            }
        }

        System.out.println(matchedList.size());


        String collectedNames = users.stream()
                .filter(name -> name.equals("oleksandr"))
                .collect(Collectors.joining(",", "Names: ", "."));

        System.out.println(collectedNames);

    }
}
