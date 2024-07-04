package classbasics;

public class Flight {

    int passengers;
    int seats;

    //defining constructor
    Flight() {
        System.out.println("this is flight construtor");
    }


    public void getDetails() {
        System.out.println("passengers   " + passengers);
        System.out.println("seats  " + seats);
    }


}
