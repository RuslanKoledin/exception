package exception;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){










        //исключение в работе с арифметическими операциями , вводом пользователя
        /*

        //какое нужно ловить исключение IOException или ArithmeticException?
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("арифметическая ошибка, на ноль делить нельзя ! ");
        }
        System.out.println( a + " / " + b + " = " + c);

        //исключение в работе со строками
         */

        /*String s = null;
         try {
             String m = s.toLowerCase(Locale.ROOT);
         }catch (NullPointerException exception){
             exception.printStackTrace();
             System.out.println("строка пуста !");
         }
        System.out.println("строка -> " + s);*/

        //исключение в работе с массивами
         /*int [] array = new int[2];
         try{
             array [8] = 5;
         }catch (ArrayIndexOutOfBoundsException exception){
             exception.printStackTrace();
             System.out.println("вы вышли за пределы массива!r");
         }*/


        //1005
        /*Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double MEDIA = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.println("MEDIA =%.5f/n " + MEDIA);*/
//1008
      /*  Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + hours * salary);
*/

//1009

        /*try {
            exception.Ruslan.checkAge(19);
            System.out.println("asdas");
        }catch (exception.AgeException exception){
            System.out.println("----");
        }*/




    }
}



