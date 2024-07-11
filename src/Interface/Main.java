package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any string to print");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int res=0;
        String[] split = userInput.split(",");

        for(int i=0;i<split.length;i++)
        {
            res=res+Integer.parseInt(split[i]);
        }
        System.out.println(res);
    }
}
