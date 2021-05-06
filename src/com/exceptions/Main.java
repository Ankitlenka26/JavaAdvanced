package com.exceptions;

import Exceptions.ExceptionsDemo;
import Generics.GenericList;
import Generics.List;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        list.get(0);
        // we can catch our mistakes in compile time rather than catching them in run time
    }
}
