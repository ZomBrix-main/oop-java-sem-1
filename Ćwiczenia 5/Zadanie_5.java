import java.io.*;
import java.util.*;
import java.text.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, p;
        short x;
        System.out.print("Podaj liczbę:");
        x = sc.nextShort();
        temp.toBinary(x);
        System.out.print("Podaj ilość bitów do odczytania:");
        n = sc.nextInt();
        System.out.print("Podaj pozycję początku odczytania:");
        p = sc.nextInt();
        System.out.println("Liczba dziesiętnie:"+temp.valueOfGroup(x,n,p));
    }
    static void toBinary(short n){
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
    static int valueOfGroup(short x, int n, int p){
        return x>>(p+1-n)&~(~0<<n);
    }
}