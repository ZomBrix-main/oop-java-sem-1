import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        int[] tab = new int[8];
        int[] xSortAsc=new int[8];
        int element = 5;
        temp.readTab1D(tab);
        System.out.println("Początkowa tablica:");
        temp.printTab1D(tab);
        xSortAsc=temp.sorttab(tab,xSortAsc);
        System.out.println("Tablica po sortowaniu rosnąco:");
        temp.printTab1D(tab);
        System.out.println(element+" zostało znalezione na miejscu: "+Arrays.binarySearch(tab,element));
        System.out.println("Tablica po sortowaniu malejąco:");
        temp.printTab1D(xSortAsc);
    }
    static int[] sorttab(int tab[], int xSortAsc[]){
        int i,l,element=5;
        l = tab.length;
        Arrays.sort(tab);
        for(i=0;i<l;i++){
            xSortAsc[i]=tab[(l-1)-i];
        }
        return xSortAsc;
    }
    static void printTab1D(int tab[]){
        int dl=tab.length;
        for(int i=0;i<dl;i++){
            System.out.println("x["+(i+1)+"]: "+tab[i]);
        }
    }
    static void readTab1D(int tab[]){
        Scanner sc=new Scanner(System.in);
        int dl=tab.length;
        for(int i=0;i<dl;i++){
            System.out.printf("x["+(i+1)+"]: ");
            tab[i]=sc.nextInt();
        }
    }
}