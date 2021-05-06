package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        // if we can catch IOException we do not need to write FileNotFound exception as they are internally related
        // the calling of file not found exception after an io exception is redundant . the order of catching methods also matter in some cases
        FileReader reader = null;
        try{
            reader = new FileReader("file.txt");
            var value = reader.read();
        }catch (IOException e){
            // if we cannot read
            System.out.println("Could not read data+");
        }finally { // it will always get get executed
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
