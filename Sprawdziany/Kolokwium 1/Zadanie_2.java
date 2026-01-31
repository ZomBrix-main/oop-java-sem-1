import java.util.*;
public class temp{
    public static void main(String args[]){
        Random r  = new Random();
        int tab[] = new int[r.nextInt(6)+1];
        int wyn[] = new int[2];
        int d;
        d = tab.length;
        temp.wczytTab(tab);
        System.out.print("\n");
        for(int i=0; i<d; i++){
            System.out.print(" " + tab[i] + " ");
        }
        System.out.print("\n");
        temp.minS(tab, wyn);
        System.out.print("\nMinimum tablicy: "+wyn[0]);
        System.out.print("\nSuma kwadratów elementów: "+wyn[1]);
    }
    static void wczytTab(int[] tab){
        int d;
        d = tab.length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<d;i++){
            System.out.print("Podaj tab[" + (i+1) + "]: ");
            tab[i]=sc.nextInt();
        }
    }
    static void minS(int[] tab, int[] wyniki){
        int min, sum, d;
        d   = tab.length;
        sum = 0;
        min = tab[0];
        for(int i=0;i<d;i++){
            if(tab[i]<min) min = tab[i];
            sum = sum + (tab[i]*tab[i]);
        }
        wyniki[0] = min;
        wyniki[1] = sum;
    }
}