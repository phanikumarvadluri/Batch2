package Interface;

public class Nissan extends Vehicleabstact implements  Vehicle {
    @Override
    public void model() {
        System.out.println("MagniteGeza");
    }

    @Override
    public void millage() {
        System.out.println("20KM");
    }
}
