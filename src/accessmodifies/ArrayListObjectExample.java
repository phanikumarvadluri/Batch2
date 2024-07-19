package accessmodifies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectExample {


    public static void main(String[] args) {

        List<Person> list=new ArrayList<>();
        Address address =new Address("abc","NA");
        Address address1 =new Address("HYD","TG");
        Address address2 =new Address("VIZ","AP");
        Address address3 =new Address("AT","AT");
        Address address4 =new Address("CHI","CHI");

        list.add(new Person("phani.vadluri3@gmail.com",30,"Phani",'M',address1));
        list.add(new Person("phani.vadluri3@gmail.com",30,"Phani",'M',address));
        list.add(new Person("phani.vadluri3@gmail.com",30,"Phani",'M',address2));
        list.add(new Person("revant.vadluri3@gmail.com",30,"revanth",'M',address));
        list.add(new Person("sai.vadluri@gmail.com",30,"sai",'M',address));
        list.add(new Person("manish.vadluri@gmail.com",30,"manish",'M',address));
        list.add(new Person("chadini.abc@gmail.com",30,"chandini",'F',address));

       System.out.println(list);
    }
}
