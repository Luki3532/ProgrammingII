package System_Array_Copy;
/*
 * We are using copyArray here
 */
/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5};
        int[] Array_Copy = new int[5];
        System.arraycopy(Array, 0, Array_Copy, 0, 5);
        for (int i : Array_Copy) {
            System.out.println(i);
        }
    }
}