import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        int x;
        System.out.print("\nPodaj x:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        //int sil= new Pierwsza.silnia(x);
        //double sum= new Pierwsza.Oblicz(x);
        int sil;
        double sum;
        sil=Pierwsza.silnia(x);
        sum=Pierwsza.Oblicz(x);
        System.out.print("\nSilnia="+sil);
        System.out.print("\nSuma odwrotnosci silni:"+sum);
    }
}
class Pierwsza{
    public static int silnia(int n){
        int silnia=1;
        for(int i=1;i<(n+1);i++){
            silnia=silnia*i;
        }
        //System.out.print("\nSilnia="+silnia);
        return silnia;
    }
    public static double Oblicz(int n){
        double suma=0;
        double mian;
        for(int i=1;i<(n+1);i++){
            mian=Pierwsza.silnia(i);
            suma=suma+(1/mian);
        }
        System.out.print("\nSuma odwrotnosci silni:"+suma);
        return suma;
    }
}