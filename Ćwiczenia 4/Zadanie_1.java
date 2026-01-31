import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        double x[]=new double[8];
        temp.readTab1D(x);
        temp.printTab1D(x);
        Random r = new Random();
        double[] xKopia=Arrays.copyOf(x,8);
        double[] xDoubleSize=new double[16];
        int l = xDoubleSize.length;
        for(int i=0;i<l;i++){
            xDoubleSize[i]=r.nextDouble(100);
        }
        temp.printTab1D(xDoubleSize);
        double[] z= Arrays.copyOfRange(x,4,8);
        temp.printTab1D(z);
    }
    static void readTab1D(double tab[]){
        int n;
        n=tab.length;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Podaj " + (i+1) + " wartość:");
            tab[i]=sc.nextDouble();
        }
    }
    static void printTab1D(double tab[]){
        for(double element:tab) System.out.println(element);
    }
}