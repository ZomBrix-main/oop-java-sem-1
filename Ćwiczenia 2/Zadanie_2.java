import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.Math.*;
import java.util.Random;
public class zadanie_2{
    public static void main(String args[]){
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj zakres:");
        while(! sc.hasNextInt()){
            System.out.print("Blad, podaj poprawnie:");
            sc.next();
        }
        int n=sc.nextInt();
        for(int i=0; i<5; i++){
            int x;
            System.out.println("\nRandom int nr "+ (i+1) +": " + (x=r.nextInt()));
        }
        for(int i=0; i<10; i++){
            float x;
            System.out.println("\nRandom float nr "+ (i+1) +": " + (x=r.nextFloat()));
        }
        for(int i=0; i<12; i++){
            int x;
            System.out.println("\nRandom int nr "+ (i+1) +": " + (x=r.nextInt(n)));
        }
        for(int i=0; i<15; i++){
            int x, a=-10, b=20;
            System.out.println("\nRandom int nr "+ (i+1) +": " + (x=r.nextInt(a,b)));
        }
    }
}
