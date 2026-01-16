public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        Shirt tish = new Shirt(" Polo "," Röd "," 20 ");
        Shirt långarm = new Shirt(" College ", " Beige ", " 50 ");

        System.out.println("Skjorta 1:" +  tish.getColor() + tish.getBrand() + "pris:" + tish.getPrice());
        System.out.println("Skjorta 2:" + långarm.getColor() + långarm.getBrand() + "pris:" + långarm.getPrice());


    }
}
