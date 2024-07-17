package inheitence;

public class ChildC extends ParentC {
    int age=30;
    ChildC() {
        System.out.println("Child class constuctor");
        super.age=60;
    }
}
