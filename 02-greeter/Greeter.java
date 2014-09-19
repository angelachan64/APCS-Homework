//IMPORTS

import java.io.*;
import java.util.*;

//CODE

public class Greeter3 {
    /* Attributes go here
       We call them instance variables
    */
    public String greeting = new String("Hello World!");
    /*
      public <- can be used outside of the class
      void <- this DOES NOT return anything you would place a
              "return type" here if the method did return something
      greet <- name
      () <- parameters go here
      {} <- code goes here
    */
    public void greet() {
	System.out.println("Hello world!");
	System.out.println(s);
	ungreet();
    }

    public void ungreet() {
	System.out.println("I'm out");
    }
}

//Homework 2 COMPLETED
