package com.exceptions;

import Exceptions.ExceptionsDemo;
import Generics.GenericList;
import Generics.List;
import Generics.User;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) > 0){
            System.out.println("user1 is greater");
        }else if(user1.compareTo(user2) < 0){
            System.out.println("User1 is lesser");
        }else{
            System.out.println("Both are equal");
        }

    }
}
