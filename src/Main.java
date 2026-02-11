import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] rray = {"Luke", "Anakin", "Obi-Wan", "Yoda"};

        String[] newarray = new String[rray.length];

        for (int i = 0; i < rray.length; i++) {
            newarray[i] = rray[rray.length-1-i];
        }

        System.out.println(Arrays.toString(rray));
        System.out.println(Arrays.toString(newarray));


    }
}
