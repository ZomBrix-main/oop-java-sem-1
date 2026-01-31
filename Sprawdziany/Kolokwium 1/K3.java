import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){

        int l;
        l = 1;

        System.out.print("\nLiczba int przed: "+ l);
        System.out.print("\n");

        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int k=1;
        for(int i=0;i<8;i++) {
            if ((l&k)!=0) bit[i]=1; else bit[i]=0;
            k=k*2;
        }
        for (int i=7;i>=0;i--) System.out.print(" " + bit[i] + " ");
        System.out.print("\n");

        ustawBity1(l);
    }
    static void ustawBity1(int l){
        
        int n, m, b1, b2;
        n = 2;
        m = 4;

        int maska0=0;
        int maska1=~maska0;
        int maska2a=maska1<<1;
        int maska2=~maska2a;
        int maska3=maska2<<(8-(n));
        b1=l|maska3;
        int maska4=maska2<<(8-(m));
        b2=b1|maska4;

        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int k=1;
        for(int i=0;i<8;i++) {
            if ((b2&k)!=0) bit[i]=1; else bit[i]=0;
            k=k*2;
        }
        for (int i=7;i>=0;i--) System.out.print(" " + bit[i] + " ");
        System.out.print("\nLiczba int po: "+ b2);
    }
}