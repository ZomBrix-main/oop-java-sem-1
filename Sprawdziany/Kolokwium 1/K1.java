import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String[] Args){
        double y[] = new double[6];
        Random r   = new Random();
        for(int i=0; i<y.length; i++){
            y[i]=r.nextDouble(0,20);
        }
        for(int i=0; i<y.length; i++){
            System.out.print(" " + y[i] + " ");
        }
        double x[];
        x = temp.modTab(y);
        for(int i=0; i<x.length; i++){
            System.out.print(" " + y[i] + " ");
        }
    }
    static double[] modTab(double[] tab){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nPodaj dolny zakres przedziału: ");
        double a = sc.nextDouble();
        System.out.println("Podaj górny zakres przedziału: ");
        double b = sc.nextDouble();
        int d    = tab.length;
        int l;
        l=0;
        for (int i=0; i<d; i++){
            if(tab[i]>a){
                if(tab[i]<b) l=l+1;
            }
        }
        double mTab[] = new double[d-l+1];
        int k;
        k=0;
        for (int i=0; i<d; i++){
            if(tab[i]<a){
                 mTab[i]=tab[k];
                 k++;
            } else if(tab[i]>b){
                mTab[i]=tab[k];
                k++;
            }
        }
        return mTab;
    }
}