package enumki;

import static enumki.seasons.*;

public class Main {
    public static void main(String[] args) {

        getSeasonType(SPRING);

    }

    static void getSeasonType(seasons seasons){
        switch (seasons){
            case AUTUMN:
                System.out.println("сейчаас осень ");
            break;
            case WINTER:
                System.out.println("сейчас зима");
                break;
            case SUMMER:
                System.out.println("сейчас лето");
                break;
            case SPRING:
                System.out.println("сейчас весна");
                break;
        }
    }
}
