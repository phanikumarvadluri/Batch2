package Interface;

public  class Mahindra extends Vehicleabstact implements Vehicle {
    @Override
    public void model() {
        System.out.println("XUV700");
    }

    @Override
    public void millage() {
        System.out.println("16KM");
    }



}
