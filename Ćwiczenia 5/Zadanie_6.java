import java.io.*;
import java.util.*;
import java.text.*;
public class temp {
    public static void main(String[] args) {
        int u = -7;
        int u1 = u>>u;
        int u2 = u>>>u;
        int u3 = u1>>>u1;
        int u4 = u2>>u2;
        System.out.println("u:"+u);
        System.out.println("u1 = >>u:"+u1);
        System.out.println("u2 = >>>u:"+u2);
        System.out.println("u3 = >>>u1:"+u3);
        System.out.println("u4 = >>u2:"+u4);
    }
}