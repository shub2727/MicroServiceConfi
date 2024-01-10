package org.example;

import java.beans.Encoder;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {




        System.out.println("Hello world!");
    }

    public String encode(String text){
        Base64.Encoder encoder= Base64.getEncoder();

        String encodString= encoder.encodeToString(text.getBytes());
        return encodString;

    }
}