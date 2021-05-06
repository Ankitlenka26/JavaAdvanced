package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show(){
        try{
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        }catch(FileNotFoundException ex){
            // if file is not found
            System.out.println("File does not exist");
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
