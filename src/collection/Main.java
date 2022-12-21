package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Monday", "Понедельник");
        map.put("Tuesday", "Вторник");
        map.put("Wednesday", "Среда");
        map.put("Thursday", "Четверг");
        map.put("Friday", "Пятница");
        map.put("Saturday", "Суббота");
        map.put("Sunday", "Воскресенье");

        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        for (Map.Entry<String, String> keyAndValues : map.entrySet()) {
            if (scan.equalsIgnoreCase(keyAndValues.getKey())) {
                System.out.println(keyAndValues.getKey() + " >> " + keyAndValues.getValue());

            }
        }


    }
}

