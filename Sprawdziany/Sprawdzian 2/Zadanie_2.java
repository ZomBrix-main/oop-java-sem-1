import static java.util.Arrays.*;
import java.util.Random;

public class Prog2KK {
    public static void main(String args[]){
        int n = 20195%3+5;
        int tabKK[] = new int[n];

        copyOf(tabKK, 2*n);
        for(int i = 0; i< tabKK.length; i++){
            Random r = new Random();
            int x = r.nextInt();
            tabKK[i] = (x%(2*n-1-n+1))+n+1;
        }

        for(int i = 0; i < tabKK.length; i++){
            System.out.printf("%d ",tabKK[i]);
        }
        System.out.println("\n");

        sort(tabKK);
        tabKK = inverseElementsKK(tabKK);

        for(int i = 0; i < tabKK.length; i++){
            System.out.printf("%d ",tabKK[i]);
        }
    }
    static int []inverseElementsKK(int []tab){
        int temp, n = tab.length;
        int tabTemp[] = new int[n];
        for(int i = 0; i< n; i++){
            tabTemp[i] = tab[n-i-1];
        }
        return tabTemp;
    }
}