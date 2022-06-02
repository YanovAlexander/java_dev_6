package got.java.dev6.mothod9.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Developer> developersExtends = new ArrayList<>();
        List<? super Developer> developersSuper = new ArrayList<>();

        SeniorDeveloper seniorDeveloper  = new SeniorDeveloper();
        Person person = new Person();

//        developersExtends.add(seniorDeveloper);
//        developersExtends.add(person);

        developersSuper.add(seniorDeveloper);
//        developersSuper.add(person);

        List<Developer> developers = new ArrayList<>();
        List<SeniorDeveloper> seniorDevelopers = new ArrayList<>();
        List<Person> people = new ArrayList<>();
        List<Manager> managers = new ArrayList<>();

        sort(developers);
//        sort(seniorDevelopers);
        sort(people);
//        sort(managers);

        sorted(developers);
        sorted(seniorDevelopers);
//        sorted(people);
//        sorted(managers);

        List<? extends Number> numbers = new ArrayList<Integer>();

        List<? extends Number> numbers1 = null;
        List<? extends Integer> integers = null;

        numbers1 = integers;


//        integers = numbers1;

    }

    private static void sort(List<? super Developer> developers) {
        //sorting
    }

    private static void sorted(List<? extends Developer> developers) {
        //sorting
    }
}
