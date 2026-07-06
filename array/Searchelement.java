package array;
import java.util.*;
public class Searchelement {
     public int search(int arr[], int x) {
        // code here
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Searchelement obj = new Searchelement();
        int[] arr = {3, 5, 1, 8, 2};
        int x = 8;
        int result = obj.search(arr, x);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    
}
