package Constructor;

public class Pesron {
    private String name;
    private int age;
    private String panNumber;
    private double salary;
    private boolean maritalStatus;

    Pesron() {
        System.out.println("this is default constructor");
    }

    Pesron(String name, int age) {
        this.name = name;
        this.age = age;
    }


    Pesron(String name, int age,String panNumber,double salary,boolean maritalStatus) {
        this(name,age);//constutor call
        this.panNumber = panNumber;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
    }





    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(panNumber);
        System.out.println(salary);
        System.out.println(maritalStatus);
    }


}
