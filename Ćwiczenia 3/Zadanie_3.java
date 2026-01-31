import java.io.*;
import java.util.*;
import java.text.*;
public class Zadanie_2{
    public static void main(String args[]){
        int y[][]=new int[3][3];
        int kol, wier;
        kol=y.length;
        wier=y[0].length;
        Tab2DReadPrint.readTab2D(kol, wier, y);
        Tab2DReadPrint.printTab2D(y);
    }
}
class Tab2DReadPrint{
    public static void readTab2D(int w, int k, int tab[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print("Podaj tab[" + (i+1) + "][" + (j+1) +"]: ");
                tab[i][j]=sc.nextInt();
            }
        }
    }
    public static void printTab2D(int tab[][]){
        for(int x[]:tab){
            for(int y: x){
                System.out.println(y+" ");
            }
            System.out.println();
        } 
    }
    //public static void transpose2D()
}