import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){
        Comp c1 = new Comp();
        System.out.println(c1.obliczMax(6,2));
        System.out.println(c1.obliczSrednia(20,10));
    }
}
interface Computation{

    int obliczMax(int x, int y);
    int obliczSrednia(int x, int y);
}

class Intermediate implements Computation{

    public int obliczMax(int x, int y){return 0;};
    public int obliczSrednia(int x, int y){return 0;};
}

class Comp extends Intermediate{

    public int obliczMax(int x, int y){
        if(x>y) return x;
        else if(y>x) return y;
        else if(x==y){
            System.out.print("\nRówne ");
        }
        return x;
    }

    public int obliczSrednia(int x, int y){
        return (x+y)/2;
    }
}