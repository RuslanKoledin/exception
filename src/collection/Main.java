package collection;

import java.util.HashMap;
import java.util.Map;

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

        for (Map.Entry<String,String> keyAndValues : map.entrySet()) {
            System.out.println(keyAndValues.getKey() + " >> " +  keyAndValues.getValue());
        }




    }


}

