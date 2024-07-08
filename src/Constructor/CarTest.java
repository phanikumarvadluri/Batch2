package Constructor;

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car("mahindra");
        String res=car.speed();
        System.out.println(res);
    }
}
