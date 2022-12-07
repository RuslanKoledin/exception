package exception;

public class AgeException extends Exception{

   public static String message = "вы несовершеннолетний!";

    public AgeException() {
        super(message);
    }
}
