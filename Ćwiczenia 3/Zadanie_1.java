import java.io.*;
import java.util.*;
import java.text.*;
public class Zadanie_1{
	public static void main(String args[]){
		double x[]= new double[5];
        int kol;
        kol=x.length;
        Zadanie_1.readTab1D(kol,x);
        Zadanie_1.printTab1D(x);
        Zadanie_1.maxMin(x);
	}
    public static void readTab1D(int n, double tab[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Podaj " + (i+1) + " wartosc:");
            tab[i]=sc.nextDouble();
        }
    }
    public static void printTab1D(double tab[]){
        for(double element:tab) System.out.println(element);
    }
    public static void maxMin(double tab[]){
        int kol;
        kol=tab.length;
        double temp, min, max;
        min=tab[0];
        max=tab[0];
        double wyniki[]=new double[2];
        for(int i=0; i<kol; i++){
            temp=tab[i];
            if(temp>max){
                max=temp;
            } else if(temp<min){
                min=temp;
            }
        }
        wyniki[0]=min;
        wyniki[1]=max;
        System.out.print("Minimalna wartosc tablicy: " + wyniki[0] + " maksymalna:" + wyniki[1]);
    }
}