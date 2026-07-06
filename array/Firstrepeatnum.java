package array;
import java.util.*;

public class Firstrepeatnum {
     public static int firstRepeated(int[] arr) {
        // code here
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[j] == arr[i]){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int result = firstRepeated(arr);
        if(result != -1){
            System.out.println("First Repeated Element Index: " + result);
        } else {
            System.out.println("No Repeated Element Found");
        }
    }
    
}
