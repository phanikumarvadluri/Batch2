package Constructor;

public class Flight {
    int seats;
    int passengers;


    Flight()
    {
       System.out.println("Consttucter is called");
    }

    public void addPassenger()
    {
        seats=seats+1;
        System.out.println(seats);
    }

    public void addPassenger(int inputSeats)
    {
        seats=inputSeats+1;
        System.out.println(seats);
    }

}
