package utilities;

import java.util.Random;

public class Utilities {

    public static String randomEmail(){
        Random random = new Random();
        String baseEmail = "correo90@correo80.com";
        return Integer.toString(random.nextInt(10000)).concat(baseEmail);
    }
}
