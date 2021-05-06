package Exceptions;

public class ExceptionsDemo {
    public static void show(){
        sayHello(null); // represents the absence of a value
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
