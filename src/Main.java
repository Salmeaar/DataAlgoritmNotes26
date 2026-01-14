public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        Car car = new Car("Mazda");
        Car electricvehicle = new Car("Mitsubishi");

        System.out.println(car.getName());
        car.setName("Toyota");
        System.out.println(car.getName());
        System.out.println(electricvehicle.getName());



    }
}
