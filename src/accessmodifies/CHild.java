package accessmodifies;

public class CHild implements  Parent {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    public static void main(String[] args) {

        Parent c=new CHild();
        c.m1();


    }
}
