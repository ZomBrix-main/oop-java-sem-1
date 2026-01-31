import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        String s1 = "programowanie";
        System.out.println(s1);
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.append(" obiektowe I");
        sb1.setCharAt(0, 'P');
        sb1.toString();
        System.out.println(sb1);
    }
}