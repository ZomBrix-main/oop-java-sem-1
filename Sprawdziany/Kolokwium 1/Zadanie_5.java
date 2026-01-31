import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){

        obliczBig();

    }
    static void obliczBig(){
        BigDecimal a = new BigDecimal("38");
        BigDecimal b = new BigDecimal("12");
        BigDecimal c = new BigDecimal("24");
        BigDecimal d = new BigDecimal("20");

        System.out.print("\na= " + a);
        System.out.print("\nb= " + b);
        System.out.print("\nc= " + c);
        System.out.print("\nd= " + d);

        BigDecimal wyr, naw, ulam;
        naw  = b.multiply(c);
        ulam = naw.divide(d);
        wyr  = a.add(ulam);
        System.out.print("\nWynik wyrażenia (a+(b*c)/d): " + wyr);
    }
}