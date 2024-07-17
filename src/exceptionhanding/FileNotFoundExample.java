package exceptionhanding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// JDBC and Spring boot  try , catch, throw, throws and userfeffined exception class--- finally, try with resource

public class FileNotFoundExample {

    public static void main(String[] args) {
       try {
           FileReader fileReader = null;
           BufferedReader bufferReader = null;
           fileReader = new FileReader("C:\\Users\\Phani Kumar\\IdeaProjects\\Batch2\\src\\exceptionhanding\\test.txt");
           // create an instance of the BufferedReader and pass the FileReader instance to it.
           bufferReader = new BufferedReader(fileReader);
           // declaring an empty string by passing null value
           String fileData = null;
           // use while loop to read and print data from buffered reader
           while ((fileData = bufferReader.readLine()) != null) {
               System.out.println(fileData);
           }
           // closing the BufferedReader object
           bufferReader.close();
       }



       catch(FileNotFoundException ex)
       {
           System.out.println("Looks like no file present!!!");
       }
       catch(IOException ex)
       {
           System.out.println("Looks like no Readline!!!");
       }

       catch(Exception ex)
       {
           System.out.println("Generic Execption");
       }

    }
}
