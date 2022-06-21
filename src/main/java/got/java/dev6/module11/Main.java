package got.java.dev6.module11;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String name = "Oleksandra";
        String name1 = "Ivan";
        String name2 = "Taras";
        List<String> names = List.of(name1, name, name2);
        String nameToContain = "ksandr";
//        nameToContain = "abc";
//        CustomPredicate<String> validateName = new CustomPredicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.equals("ksandr");
//            }
//        };

//        CustomPredicate<String> validateName = inputName -> inputName.contains("ksandr") && inputName.equals("Ivan");

        String result = findFirstName(names, s -> s.contains(nameToContain));
        String taras = findFirstName(names, s -> s.equals("Taras1"));
        System.out.println(result);
        System.out.println(taras);

        Double overtimeSalary = 1.5;
        Function<Integer, Double> calculateOvertime = salary -> salary * overtimeSalary;

        Double salaryWithOvertime = calculateOvertime.apply(25607);
        System.out.println(salaryWithOvertime);

        BiFunction<Integer, Integer, Double> calculateOvertimeWithDays = (Integer salary, Integer days) -> (salary * overtimeSalary) / days;

        System.out.println(calculateOvertimeWithDays.apply(25607, 20));


        Supplier<Integer> randomValue = () -> new Random().nextInt();

        System.out.println(randomValue.get());

    }

    private static String findFirstName(List<String> names, CustomPredicate<String> predicate) {
        for (String name : names) {
            boolean test = predicate.test(name);
            if (test) {
                return name;
            }
        }
        return null;
    }
}
