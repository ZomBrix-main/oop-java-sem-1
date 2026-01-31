import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){

        double[][] x1;
        x1 = new double[][]{{0, -1, -0.5, -0.33, -0.25},{1, 0, -1, -0.5, -0.33}, {0.5, 1, 0, -1, -0.5},
                {0.33, 0.5, 1, 0, -1}, {0.25, 0.33, 0.5, 1, 0}};
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                try{
                    if(x1[i][j]<0){
                        throw new MyExceptionClass(x1[i][j]);
                    } else System.out.print(" "+x1[i][j]+" ");
                }
                catch (MyExceptionClass e){
                    System.out.println(e);
                }
            }
            System.out.print("\n");
        }

    }
}
class MyExceptionClass extends  Exception{

    double n;

    MyExceptionClass(double x){
        this.n=x;
    }

    public String toString(){
        return " "+n+" jest ujemne";
    }
}