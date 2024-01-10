package Passencoder;

import java.beans.Encoder;
import java.util.Base64;

public class Main {

    public String encode(String text){
        Base64.Encoder encoder= Base64.getEncoder();

        String encodString= encoder.encodeToString(text.getBytes());
        return encodString;

    }
}