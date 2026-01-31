import java.io.*;
import java.util.*;
import java.text.*;
public class temp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x;
        int p=1;
        do{
            System.out.print("\nPodaj liczbę dziesiętną:");
            x=sc.nextInt();
            System.out.print("\n");
            temp.toBinary(x);
            System.out.print("\nCzy chcesz podać kolejną liczbę? 0=n, 1=t");
            p=sc.nextInt();
        }
        while(p>0);
    }
    public static void toBinary(int n){
        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int k=1;
        for(int i=0;i<16;i++) {
            if ((n&k)!=0) bit[i]=1; else bit[i]=0;
            k=k*2; 
        }
        for (int i=15;i>=0;i--) System.out.print(" " + bit[i] + " ");
        System.out.print("\n");
        k=1;
    }
}