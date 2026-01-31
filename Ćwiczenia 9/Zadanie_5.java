import java.io.*;
import java.util.*;
class Point { // klasa bazowa
    int x; int y;
    Point () {
        System.out.println(" Konstruktor bezparametrowy klasy bazowej");
    }
    Point (int x, int y) {
        System.out.println("Konstruktor klasy bazowej z dwoma parametrami");
        this.x=x;
        this.y=y;
    }
    Point (Point punkt1) {
        x=punkt1.x;
        y=punkt1.y;
        System.out.println("Konstruktor klasy bazowej z jednym parametrem - obiektem klasy Point");
    }
}
class Point3D extends Point// klasa pochodna
{ int z;
    Point3D ( ) {
        System.out.println("Konstruktor bezparametrowy klasy pochodnej");
    }
    Point3D ( int x, int y, int z) {
        super(x,y);// wywołanie konstruktora klasy bazowej
        this.z=z;
        System.out.println("Konstruktor klasy pochodnej z trzema parametrami ");
    }
}// zakończenie deklaracji klasy pochodnej
public class temp {
    public static void main(String args[]) throws IOException {
        Point punkt1, punkt2, punkt3;
        System.out.println(" Tworzenie obiektu punkt1 klasy Point");
        punkt1 = new Point();
        System.out.println(" Tworzenie obiektu punkt2 klasy Point");
        punkt2 = new Point(10, 20);
        System.out.println(" Tworzenie obiektu punkt3 klasy Point");
        punkt3 = new Point(punkt2);
        System.out.println(" punkt1.x=" + punkt1.x);
        System.out.println(" punkt1.y=" + punkt1.y);
        System.out.println(" punkt2.x=" + punkt2.x);
        System.out.println(" punkt2.y=" + punkt2.y);
        System.out.println(" punkt3.x=" + punkt3.x);
        System.out.println(" punkt3.y=" + punkt3.y);
        Point3D obiektPoch1, obiektPoch2;
        obiektPoch1 = new Point3D();// tworzenie obiektu 1 klasy pochodnej
        obiektPoch1 = new Point3D(1, 2, 3);// tworzenie obiektu klasy pochodnej
    }
}
