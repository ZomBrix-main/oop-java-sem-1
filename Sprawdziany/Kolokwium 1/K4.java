import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    public static void main(String args[]){

        String[][] tabS = new String[4][4];

        temp.fillstringcol(tabS);

        for (int i = 0; i < tabS.length; i++){
            for (int j = 0; j < tabS[0].length; j++){
                System.out.print(" " + tabS[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static void fillstringcol(String[][] tabS){
        for (int i = 0; i < tabS.length; i++){
            for (int j = 0; j < tabS[0].length; j++){
                if(j==0){
                    tabS[i][j] = "E1 +nrK";
                } else{
                    tabS[i][j] = "NULL"; 
                }
            }
        }
    }
}