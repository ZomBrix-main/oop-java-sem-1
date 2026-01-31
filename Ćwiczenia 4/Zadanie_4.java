import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){
        BigInteger a= new BigInteger("23452347654222");
        BigInteger b=BigInteger.valueOf(100);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("a + b = "+a.add(b).toString());
        System.out.println("a - b = "+a.subtract(b).toString());
        System.out.println("a * b = "+a.multiply(b).toString());
        System.out.println("a / b = "+a.divide(b).toString());
        System.out.println("a mod b = "+a.mod(b).toString());
        BigInteger c = new BigInteger("15000");
        BigInteger pom = a.add(b);
        BigInteger dzialanie=c.multiply(pom.add(BigInteger.valueOf(100)));
        System.out.printf("\n"+c+"*("+a+"+"+b+"-100)="+dzialanie);
    }
}