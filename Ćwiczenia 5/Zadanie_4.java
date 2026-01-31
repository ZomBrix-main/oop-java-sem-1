import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        int l;
        int b1, b2;
        System.out.print("Podaj liczbę:");
        l=sc.nextInt();
        temp.toBinary(l);
        System.out.print("Podaj numer bitu do zmiany:");
        x=sc.nextInt();
        int maska0=0;
        temp.toBinary(maska0);
        int maska1=~maska0;
        temp.toBinary(maska1);
        int maska2a=maska1<<1;
        temp.toBinary(maska2a);
        int maska2=~maska2a;
        temp.toBinary(maska2);
        int maska3=maska2<<(8-(x));
        temp.toBinary(maska3);
        b1=l|maska3;
        int maska4=~maska3;
        temp.toBinary(maska4);
        b2=l&maska4;
        System.out.print("\nLiczba z określonym 1:");
        temp.toBinary(b1);
        System.out.print("\nLiczba z określonym 0:");
        temp.toBinary(b2);
        int maskaM0=maska1<<4;
        temp.toBinary(maskaM0);
        int maskaM1=~(maska1<<4);
        temp.toBinary(maskaM1);
        int maskaS0=~(maska1<<4);
        temp.toBinary(maskaS0);
        int maskaS1=maska1<<4;
        temp.toBinary(maskaS1);
    }
    static void toBinary(int n){
        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int k=1;
        for(int i=0;i<8;i++) {
            if ((n&k)!=0) bit[i]=1; else bit[i]=0;
            k=k*2;
        }
        for (int i=7;i>=0;i--) System.out.print(" " + bit[i] + " ");
        System.out.print("\n");
        k=1;
    }
}