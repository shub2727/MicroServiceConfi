package org.example;

import Passencoder.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Main main= new Main();

        String ss= main.encode("shubham");

        System.out.println(ss);
    }
}
