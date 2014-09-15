//IMPORTS

import java.io.*;
import java.util.*;

//CODE

public class Greeter {
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
	ungreet();
    }

    private void ungreet() {
	System.out.println("I'm out");
    }
}

//Homework 2 COMPLETED
