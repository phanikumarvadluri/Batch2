package inheitence;

public class Bicycle {
    private int gear;
    private int speed;

    Bicycle() {

    }

    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void speedUp(int speed)
    {
        this.speed=this.speed+speed;
        System.out.println(this.speed);
    }

    public void speedDown(int speed)
    {
        this.speed=this.speed-speed;
        System.out.println(this.speed);
    }
}
