import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        String s1="ANS";
        System.out.print("\ns1: " + s1);
        String s2=new String("ANS");
        System.out.print("\ns2: " + s2);
        String s3=s1+s2;
        System.out.print("\ns3: " + s3);
        char[] tabZ={'A','N','S'};
        String s4=new String(tabZ);
        System.out.print("\ns4: " + s4);
        Date data=new Date();
        String s5="Data: "+data;
        System.out.print("\n " + s5);
    }
}