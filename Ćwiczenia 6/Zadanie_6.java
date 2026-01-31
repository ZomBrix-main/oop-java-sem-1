import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        String s1 = "Greetings";
        String s2 = "Cyberpunk";
        String s3 = "greetings";
        String s4 = "punk";
        String s5 = "Cyberpunk";

        System.out.println("Łańcuchy znaków: "+s1+", "+s2+", "+s3+", "+s4+", "+s5);
        System.out.println("Porównanie s1 i s2: "+s1.equals(s2));
        System.out.println("Porównanie s1 i s3: "+s1.equals(s3));
        System.out.println("Porównanie s2 i s5: "+s2.equals(s5));
    }
}