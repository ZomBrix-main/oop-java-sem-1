import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        int w, k;
        System.out.print("\nPodaj ilosc wierszy");
        Scanner sc=new Scanner(System.in);
        w=sc.nextInt();
        System.out.print("\nPodaj ilosc kolumn");
        k=sc.nextInt();
        double tab[][]=new double[w][k];
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print("Podaj tab[" + (i+1) + "][" + (j+1) +"]: ");
                tab[i][j]=sc.nextInt();
            }
        }
        double tab2[][]=new double[w][k];
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print("Podaj tab2[" + (i+1) + "][" + (j+1) +"]: ");
                tab2[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nTablica 1:\n");
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print(" " + tab[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\nTablica 2:\n");
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print(" " + tab2[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\nSuma wiersza 1:"+temp.SumW(0,k,tab));
        System.out.print("\nSuma kolumny 1:"+temp.SumK(w,0,tab));
        System.out.print("\nSuma elementów tablicy:"+temp.SumT(w,k,tab));
        System.out.print("\nSuma tablic:\n");
        double tab3[][]= new double[w][k];
        tab3=temp.Sum2T(w,k,tab,tab2);
        temp.wydruk(w,k,tab3);
    }
    static void wydruk(int w, int k, double tab[][]){
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print(" " + tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    static double SumW(int w, int k, double tab[][]){
        double SumW=0;
        for(int i=0;i<k;i++){
            SumW=SumW+tab[w][i];
        }
        return SumW;
    }
    static double SumK(int w, int k, double tab[][]){
        double SumK=0;
        for(int i=0;i<w;i++){
            SumK=SumK+tab[i][k];
        }
        return SumK;
    }
    static double SumT(int w, int k, double tab[][]){
        double SumT=0;
        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                SumT=SumT+tab[i][j];
            }
        }
        return SumT;
    }
    static double[][] Sum2T(int w, int k, double tab[][], double tab2[][]){
        double tabS[][]=new double[w][k];
        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                tabS[i][j]=tab[i][j]+tab2[i][j];
            }
        }
        return tabS;
    }
}