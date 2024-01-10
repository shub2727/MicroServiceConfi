import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main  {

    String s;


    public static void main(String[] args) {

        Main mm= new Main();
        mm.s= "shubham";
        Main mm1= new Main();
        mm1.s= "shubham0";

        System.out.println(mm.s.equals(mm1.s));

        String s= new String("shubham");


        String s1= new String("shubham");

        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        System.out.println("Hello world!");

        try {
            FileReader
            int a= 10/0;
        }catch (Exception e){

            System.out.println("yo cann not dividde this by 0");



        }

        int b=10+20;
        System.out.println(b);






    }


}