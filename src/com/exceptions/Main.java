package com.exceptions;

import Exceptions.ExceptionsDemo;
import Generics.GenericList;
import Generics.List;
import Generics.User;
import Generics.Utils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var max = Utils.max(1,2);
        System.out.println(max);
        var max1 = Utils.max(new User(10) , new User(20));
        System.out.println(max1); // it will give the hashcode of the object
    }
}
