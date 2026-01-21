public class Main {
    public static void main(String[] args){
        System.out.println("hello");

        Shirt shirt = new Shirt(50);
        Hat hat = new Hat(20);

        System.out.printf("Skortans skick: %d\n", shirt.getCondition());
        shirt.mend();
        System.out.printf("Skortans skick: %d\n", shirt.getCondition());

        hat.mend();

        Vechicle car = new Car("VW", 12000);
        Vechicle bike = new Bike("Scott");
        Car car2 = new Car("Volvo");
        Vechicle todaysVehicle;

        //Vehicle boat = new Vehicle("Buster", "båt");

        car.setPrice(10000);
        System.out.printf("%s kostar %.2f €\n",
                car.getName(),
                car.getPrice()
        );

        System.out.println(car.getName() + " kostar " + car.getPrice() + " €");

        todaysVehicle = car;
        System.out.printf("I dag åker jag %s\n", todaysVehicle.getName());
        todaysVehicle = bike;
        System.out.printf("I morgon åker jag %s\n", todaysVehicle.getName());

        // overload
        car2.refuel();
        car2.refuel(50);


        System.out.println(car.getName() + " is " + car.getVehicleType());
        System.out.println(bike.getName() + " is " + bike.getVehicleType());



        System.out.println(car.getName() + " säger " + car.soundWarning());
        System.out.println(bike.getName() + " säger " + bike.soundWarning());


        Claculator calc = new Claculator();

        System.out.println(calc.multiply(5, 5));


    }
}
