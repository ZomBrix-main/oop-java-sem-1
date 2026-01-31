import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Rectangle p1 = new Rectangle(); 
        Rectangle p2 = new Rectangle(3, 4);
        colorRectangle c1 = new colorRectangle();
        colorRectangle c2 = new colorRectangle(3, 4, 1);
        p1.setParRect(2, 5);
        c1.setParRectCol(2, 5, 2);
        p1.drawRect();
        p2.drawRect();
        c1.drawRect();
        c2.drawRect();

    }
}
class Rectangle{

    private int a;
    private int b;

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    Rectangle(){
        this.a = 0;
        this.b = 0;
    }

    Rectangle(int x, int y){
        this.a = x;
        this.b = y;
    }

    void setParRect(int x, int y){
        a = x;
        b = y;
    }

    void drawRect(){
        System.out.println("Rysowanie prostokąta a: " +a+" b: "+ b);
    }
}

class colorRectangle extends Rectangle{

    int color;

    colorRectangle(){
        this.color = 0;
    }

    colorRectangle(int x, int y, int c){
        super(x,y);
        this.color = c;
    }

    void setParRectCol(int x, int y, int c){
        super.setParRect(x,y);
        color = c;
    }

    void drawRect(){
        super.drawRect();
        System.out.println("Kolor: "+color);
    }
}