package opps;

public class PersonMain {
    public static void main(String[] args) {



        //Create 3 person objects
        Person p1=new Person();
        p1.setAge(10);
        p1.setName("Vivaan");
        p1.setMaritalStatus('N');
        Person p2=new Person();
        p2.setAge(20);
        p2.setName("Phani");
        p2.setMaritalStatus('N');
        Person p3=new Person();
        p3.setAge(30);
        p3.setName("sai");
        p3.setMaritalStatus('Y');

        // assigned person objects to array
        Person person[]=new Person[3];
        person[0]=p1;
        person[1]=p2;
        person[2]=p3;

        double a =10;
        double b=20;
        double c=30;

        double aarr[]=new double[3];

        aarr[0]=a;
        aarr[1]=b;
        aarr[2]=c;


        for(int i=0;i<person.length;i++)
        {
            System.out.print(person[i].getName()+ "   ");
            System.out.print(person[i].getAge()+"    ");
            System.out.print(person[i].getMaritalStatus());
            System.out.println();
        }



//        int age = p1.getAge();
//        int age2 = p2.getAge();
//        int age3 = p3.getAge();
//        System.out.println(age);
//        System.out.println(age2);
//        System.out.println(age3);


    }
}
