import java.util.*;
public class temp{
    public static void main(String[] args){

        Random r = new Random();

        int tab[][] = new int[r.nextInt(5)+1][r.nextInt(5)+1];

        int w, k;
        w=tab.length;
        k=tab[0].length;
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j]=r.nextInt();
            }
        }
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                System.out.print(" " + tab[i][j] + " ");
            }
            System.out.print("\n");
        }

        int wyn[] = new int[2];
        int w1    = r.nextInt(w)+1;
        temp.obliczMacierz(tab, wyn, w1);
        System.out.print("\nSuma przekątnej: "+wyn[0]);
        System.out.print("\nSuma wiersza "+w1+": "+wyn[1]);
    }
    static void obliczMacierz(int[][] tab, int[] wyniki, int w1){
        int w, k;
        w=tab.length;
        k=tab[0].length;

        int SumP, SumW;
        SumP=0;
        SumW=0;

        for(int i=0;i<k;i++){
            SumW=SumW+tab[w1-1][i];
        }

        for(int i=0;i<w;i++){
            for(int j=0;j<k;j++){
                if(i==j) SumP=SumP+tab[i][j];
            }
        }

        wyniki[0] = SumP;
        wyniki[1] = SumW;
    }
}