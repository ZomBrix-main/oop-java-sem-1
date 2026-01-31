import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu [-200,200]: ");
        x=sc.nextDouble();
        try{
            if(x < -200 || x > 200){
                throw new MyExceptionClass(x);
            }
        }
        catch (MyExceptionClass e){
            System.out.println(e);
        }
    }
}
class MyExceptionClass extends  Exception{

    double n;

    MyExceptionClass(double x){
        this.n=x;
    }

    public String toString(){
        return "MyExceptionClass: "+n+" is out of range[-200, 200]";
    }
}