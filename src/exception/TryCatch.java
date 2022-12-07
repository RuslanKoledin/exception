package exception;

public class TryCatch {
    public static int getFactorial(int num){

        int result=1;
        try{
            if(num<1) throw new Exception("число меньше 1");

            for(int i=1; i<=num;i++){
                result*=i;
                System.out.println(result);
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        return result;
    }
}
