package Exceptions;

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {
        // Do not overUse this feature in your applications it will make it long and verbose
        if(value <= 0){
//            throw new IllegalArgumentException("Value should be positive");
            throw new IOException();
        }else{
            System.out.println(value);
        }
    }
}
