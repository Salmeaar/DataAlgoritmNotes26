import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);
        Random r = new Random();
        do{
            System.out.printf("%d\n (enter för nytt, q for att avsluta.", r.nextInt(1, 100));
            String input = check.nextLine();


            if (input.equalsIgnoreCase("q")){
                break;
            }

        }while (true);

        System.out.println("Tack och hej");
    }

}