package WorkWithFile;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("oldFile.txt");
        File file2 = new File("newFile.txt");


        //вывод первого файла

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());

            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("файл недоступен!");
        }

        System.out.println("___________________________________________");

        //УДАЛЕНИЕ ПРОБЕЛОВ В ФАЙЛЕ
        try {
            Scanner scanner = new Scanner(file2);
            while (scanner.hasNextLine()) {
                String deleteSpaces = scanner.nextLine().replaceAll("\\s+", "");
                System.out.println(deleteSpaces);


            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("файл недоступен!");
        }

        //файл до удаления
        System.out.println("___________________________________________");
        System.out.println("содержимое файла до удаления: ");
        File file3 = new File("test.txt");
        Scanner scan = new Scanner(file3);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        //УДАЛЕНИЕ СОДЕРЖИМОГО ФАЙЛА
        //комментарий потому что файл при вызове метода файл уже удален

            /*System.out.println("содержимое файла до удаления = " + file3);
            FileOutputStream fooStream = new FileOutputStream(file3, false);

            fooStream.write("".getBytes());
            fooStream.close();*/

            System.out.println("___________________________________________");
            System.out.println("содержимое файла после удаления ");
            Scanner scan2 = new Scanner(file3);
            while (scan2.hasNextLine()) {
                System.out.println(scan2.nextLine());

            }
        }
    }



