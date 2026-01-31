import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp {
    public static void main(String args[]) {
        int k = 1;
        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int bit1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int bit2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        short lanbit1 = 12;
        short lanbit2 = -35;
        for (int i = 0; i < 16; i++) {
            if ((lanbit1 & k) != 0) bit1[i] = 1;
            else bit1[i] = 0;
            k = k * 2;
        }
        for (int i = 15; i >= 0; i--) System.out.print(" " + bit1[i] + " ");
        System.out.print("\n");
        k = 1;
        for (int i = 0; i < 16; i++) {
            if ((lanbit2 & k) != 0) bit2[i] = 1;
            else bit1[i] = 0;
            k = k * 2;
        }
        for (int i = 15; i >= 0; i--) System.out.print(" " + bit2[i] + " ");
        System.out.print("\n");
    }
}
