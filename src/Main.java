import ClothinCC.Shirt;
import VehicleClasses.Bike;
import VehicleClasses.Car;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        Car car = new Car("Mazda");
        Car electricvehicle = new Car("Mitsubishi");

        Bike bike = new Bike("Scott");

        System.out.println(car.getName());
        car.setName("Toyota");
        System.out.println(car.getName());
        System.out.println(electricvehicle.getName());

        // Clothin CC
        Shirt tish = new Shirt(" Polo "," Röd "," 20 ");
        Shirt langarm = new Shirt(" College ", " Beige ", " 50 ");

        System.out.println("Skjorta 1:" +  tish.getColor() + tish.getBrand() + "pris:" + tish.getPrice());
        System.out.println("Skjorta 2:" + langarm.getColor() + langarm.getBrand() + "pris:" + langarm.getPrice());


    }
}
