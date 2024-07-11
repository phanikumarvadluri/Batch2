package Interface;

public class Hyndai extends Vehicleabstact implements Vehicle{

    @Override
    public void model() {
        System.out.println("i20");
    }

    @Override
    public void millage() {
        System.out.println("17");
    }


}
