package got.java.dev6.mothod9;

public class EmployeeUtil {

//    public String print(Developer developer) {
//        return developer.toString();
//    }
//
//    public String print(Manager manager) {
//        return manager.toString();
//    }

    public <T> String print(T employee) {
        return employee.toString();
    }
}
