import java.io.*;

public class tryjava{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array nya ke gedean");
        } finally{
            System.out.println("Anjay mabar");
        }
        
    }
}