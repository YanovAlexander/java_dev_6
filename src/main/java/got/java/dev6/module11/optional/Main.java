package got.java.dev6.module11.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        User user = new User("oleksandr", "oleksandr@gmail.com");
        User emptyName = new User(null, "null@null.com");

        getUserNameOrReturnDefault(null);
    }


    private static String getUserNameOrReturnDefault(User user) {
        //OLD LOGIC WITH JAVA 7
//        if (user.getUsername().get() == null) {
//            return "Taras";
//        } else {
//            return user.getUsername().get();
//        }

        //NEW LOGIC WITH OPTIONAL
//        return user.getUsername().orElseThrow(() -> new IllegalArgumentException("Username can't be empty"));
//        return user.getUsername().orElseGet(() -> returnString());
        Optional<User> optionaluser  = Optional.ofNullable(user);

//        String s = optionaluser
//                .flatMap(User::getUsername)
//                .orElseGet(() -> "Taras");
//     return  user.getUsername().orElseGet(() ->  "Taras");
        return optionaluser.map( user1 -> user1.getEmail()).orElse("email");
    }


    private static String returnString() {
        return "Taras";
    }
}
