package array;
import java.util.*;

public class Missingnum {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long arraysum = 0;
        long expectedsum =  n * (n+1) / 2;
        for(int i =0; i <arr.length; i++){
            arraysum = arraysum + arr[i];
            
        }
        long ans = expectedsum - arraysum;
        return (int) ans;
    }
    public static void main(String[] args) {
        Missingnum obj = new Missingnum();
        int[] arr = {1, 2, 4, 5, 6};
        int result = obj.missingNum(arr);
        System.out.println("Missing Number: " + result);
    }
    
}
