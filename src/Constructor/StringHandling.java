package Constructor;

public class StringHandling {

    public static void main(String[] args) {


        String s="Hello|world|my|name|is|phani";
        String[] s1 = s.split("|");

        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
    }
}
