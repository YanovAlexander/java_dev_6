package got.java.dev6.module11;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);

    default void method() {
        //SOME LOGIC
    }

    static void  method1() {
        //some logic
    }
}
