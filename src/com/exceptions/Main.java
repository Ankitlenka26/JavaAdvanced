package com.exceptions;

import Exceptions.ExceptionsDemo;
import Generics.List;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        // WHAT IF WE WANT TO MAKE A LIST OF USERS(WHICH ARE OBJECTS) THEN WE CANNOT USE THE LIST CLASS THERE AND HAVE TO FORM NEW CLASS
        // WHICH IS JUST CODE REPETITION AND NOT VERY SCALABLE
    }
}
