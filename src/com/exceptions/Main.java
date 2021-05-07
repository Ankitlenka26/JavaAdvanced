package com.exceptions;

import Exceptions.ExceptionsDemo;
import Generics.GenericList;
import Generics.List;
import Generics.User;
import Generics.Utils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        list.add(2);
        for(var item : list){
            System.out.println(item);
        }
    }
}
