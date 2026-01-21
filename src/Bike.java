public class Bike extends Vechicle {

    public Bike(String name) {
        super(name, "pedaled");
    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }


    @Override
    public double getPrice() {
        return 0;
    }


    public double getStock() {
        return 0;
    }
}
