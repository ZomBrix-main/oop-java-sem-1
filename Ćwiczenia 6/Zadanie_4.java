import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        String vall = "\u5B66\uD8F0\uDE30";
        int     d   = vall.lenght();
        int     l   = vall.codePointCount(0, d);
        System.out.println("Długość: "+d+"\nLiczba jednostek: "+l);
    }
} 