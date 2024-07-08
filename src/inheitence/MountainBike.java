package inheitence;

public class MountainBike extends Bicycle {

    private int seatHeight;

    MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }


}
