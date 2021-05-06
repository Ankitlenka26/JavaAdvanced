package Exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        // this class should implement the AutoClosable interface for this to work
        try(var reader = new FileReader("file.txt");
        var writer = new FileWriter("...")
        ){ // Now we don't need to explicitly close the resource inside the finally
            // block , the java compiler does it for us
            var value = reader.read();
        }catch (IOException e){
            // if we cannot read
            System.out.println("Could not read data!");
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
