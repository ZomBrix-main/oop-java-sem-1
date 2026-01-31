import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.Math.*;
import java.util.Random;
public class temp{
    public static void main(String args[]){
        int w, k, sum;
        sum = 0;
        w   =20195%3+2;
        k   =20195%5+2;
        int tab[][];
        tab=temp.Gen2drandarrayKK(w,k,sum);
        
        for(int i=0; i<k; i++){
            for(int j=0; j<w; j++){
                System.out.print(" " + tab[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\nSuma kolumny 1:"+sum);
    }
    static int[][] Gen2drandarrayKK(int w, int k, int sum){
        sum         = 0;
        Random los  = new Random();
        int tab[][] = new int[w][k];
        for(int i=0; i<k; i++){
            for(int j=0; j<w; j++){
                tab[i][j] = los.nextInt(1,99+w);
            }
        }
        for(int i=0;i<w;i++){
            sum=sum+tab[i][0];
        }
        return tab;
    }
}