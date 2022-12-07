package exception;

public class Ruslan {

    public static boolean checkAge(int age) throws AgeException {

        if (age < 18) throw new AgeException();

        return true;
    }
}
