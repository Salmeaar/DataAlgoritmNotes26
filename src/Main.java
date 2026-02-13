import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] days = {"Ma", "Ti", "Ke", "To", "Pe", "La", "Su"};
        int today = 4; // Freda as of 13.2.26

        int jumps = 5;
        int newday = (today + jumps) % days.length;

        System.out.printf("Idag är det %s\n",days[today]);
        System.out.printf("I övermoron är det %s\n",days[today+2]);
        System.out.printf("Om %d dagar är det %s\n",jumps,days[newday]);
    }
}
