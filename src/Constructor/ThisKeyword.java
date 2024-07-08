package Constructor;

public class ThisKeyword {
    int x = 10;
    int y = 90;


    public void add(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;

        System.out.println(this.x);
        System.out.println(this.y);
    }




}
