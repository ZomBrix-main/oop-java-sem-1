import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Point p = new Point(1,2);
        p.wypisz();
        p.wyzeruj();
        p.wypisz();
        p.przesun(3,4);
        p.wypisz();
        Point pb = new Point();
        pb.wypisz();
        pb.wyzeruj();
        pb.wypisz();
        pb.przesun(1,2);
        pb.wypisz();
    }
}
class Point{
    int x;
    int y;
    Point(){
        this(3,4);
    }
    Point(int a, int b){
        x=a;
        y=b;
    }
    void wyzeruj(){
        x=0;
        y=0;
    }
    void przesun(int a, int b){
        x=a;
        y=b;
    }
    void wypisz(){
        System.out.print("\nPunkt o współrzędnych x: "+x+" y: "+y+"\n");
    }
}