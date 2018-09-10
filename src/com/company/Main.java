package com.company;
import java.io.*;
import java.util.*;

class Tester {

    public static void main(String args[]) {

        Scanner kbInput = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = kbInput.next();
        System.out.println("What is your last name?");
        String lastName = kbInput.next();
        System.out.println("Your full name is " + firstName + " " + lastName);

    }
}
