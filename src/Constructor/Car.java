package Constructor;

public class Car {
    public String speed() {
        return "90 miles";
    }
    Car() {
        System.out.println("constuctor call!!!");
    }

    Car(String s) {
        System.out.println("Parameter constuctor call!!!"+s);
    }

    Car(String s,String type) {
        System.out.println("2 Parameter constuctor call!!!"+s);
    }


}
