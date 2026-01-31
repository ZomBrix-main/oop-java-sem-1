import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.Math.*;
import java.util.Random;
public class temp{
    public static void main(String args[]){
        int w, k, sum;
        w   = 20195%3+2;
        k   = 20195%5+2;
        int tab[][] = new int[w][k];
        sum = temp.Gen2drandarrayKK(w,k,tab);

        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print(" " + tab[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\nSuma kolumny 1:"+sum);
    }
    static int Gen2drandarrayKK(int w, int k, int tab[][]){
        int sum;
        sum=0;
        Random los  = new Random();
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j] = los.nextInt(1,99+w);
            }
        }
        for(int i=0;i<w;i++){
            sum=sum+tab[i][0];
        }
        return sum;
    }
}