import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        double tabX[][]=new double[3][3];
        temp.readTab2D(tabX);
        temp.printTab2D(tabX);
    }
    static void readTab2D(double tab[][]){
        int w, k;
        k=tab.length;
        w=tab[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print("Podaj tab[" + (i+1) + "][" + (j+1) +"]: ");
                tab[i][j]=sc.nextInt();
            }
        }
    }
    static void printTab2D(double tab[][]){
        for(double x[]:tab){
            for(double y: x){
                System.out.println(y+" ");
            }
            System.out.println();
        } 
    }
}