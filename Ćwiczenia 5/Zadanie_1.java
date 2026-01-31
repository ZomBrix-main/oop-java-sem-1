import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){
        BigDecimal x=new BigDecimal("3891383912.4592");
        BigDecimal y=new BigDecimal("1259821344.42");
        System.out.print("\nx= " + x);
        System.out.print("\ny= " + y);
        System.out.print("\nSuma: " + (x.add(y)));
        System.out.print("\nRóżnica: " + (x.subtract(y)));
        System.out.print("\nIloczyn: " + (x.multiply(y)));
        System.out.print("\nIloraz: " + (x.divide(y, ROUNDINDMODE.CEILING)));
    }
}