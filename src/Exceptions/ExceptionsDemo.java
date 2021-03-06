package Exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo  {
    public static void show() throws IOException {
        var account = new Account();
        // here we are dealing with the throws part , checked exceptions.
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
