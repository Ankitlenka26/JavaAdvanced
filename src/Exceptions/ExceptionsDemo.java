package Exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        var account = new Account();
        // here we are dealing with the throws part , checked exceptions.
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
