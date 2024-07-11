package opps;

public class PersonMain2 {
    public static void main(String[] args) {


        double[] arr=new double[2];
        arr[0]=7.0;
        arr[1]=9.0;


        char[] charArray=new char[3];
        charArray[0]='a';
        charArray[1]='e';


        Person[] personArray=new Person[2];

        personArray[0]=new Person();
        personArray[0].setMaritalStatus('N');
        personArray[0].setAge(10);
        personArray[0].setName("Vaithi");

        personArray[1]=new Person();
        personArray[1].setMaritalStatus('Y');
        personArray[1].setAge(30);
        personArray[1].setName("Raju");



    }
}
