package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        // if we can catch IOException we do not need to write FileNotFound exception as they are internally related
        // the calling of file not found exception after an io exception is redundant . the order of catching methods also matter in some cases
        try{
            new SimpleDateFormat().parse("");
            var reader = new FileReader("file.txt");
            var value = reader.read();
            System.out.println("File opened");
        }catch (IOException e){
            // if we cannot read
            System.out.println("Could not read file");
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
//        catch(FileNotFoundException ex){
//            // if file is not found
//            System.out.println("File does not exist");
//        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
