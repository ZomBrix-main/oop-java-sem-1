import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){
        Rectangle p1 = new Rectangle();
        Rectangle p2 = new Rectangle(3, 4);
        ColorRectangle c1 = new ColorRectangle();
        ColorRectangle c2 = new ColorRectangle(3, 4, 1);
        p1.setRectPar(2, 5);
        c1.setRectParC(2, 5, 2);
        p1.drawRectangle();
        p2.drawRectangle();
        c1.drawRectangleC();
        c2.drawRectangleC();

    }
}
class Rectangle{

    private double p1;
    private double p2;

    public double getP1(){
        return p1;
    }

    public double getP2(){
        return p2;
    }

    Rectangle(){
        this.p1 = 0;
        this.p2 = 0;
    }

    Rectangle(double a, double b){
        this.p1 = a;
        this.p2 = b;
    }

    void setRectPar(double a, double b){
        p1 = a;
        p2 = b;
    }

    void drawRectangle(){
        System.out.println("Rysowanie prostokąta a: " +p1+" b: "+ p2);
    }
}

class ColorRectangle extends Rectangle{

    int color;

    ColorRectangle(){
        this.color = 0;
    }

    ColorRectangle(double a, double b, int c){
        super(a,b);
        this.color = c;
    }

    void setRectParC(double a, double b, int c){
        super.setRectPar(a,b);
        color = c;
    }

    void drawRectangleC(){
        super.drawRectangle();
        System.out.println("Kolor: "+color);
    }
}