import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public  static  int getInput(String quest){
        boolean acceptable= false;
        String plc = "0";
        int out = 0;

        Scanner in = new Scanner(System.in);
        System.out.println(quest);
        do{
            plc = in.nextLine();
            try{
                out = Integer.parseInt(plc);
                acceptable = true;
            }catch (Exception e){
                System.out.println("Ge ett heltal");

            }
        }while (!acceptable);

        return out;
    }
}
