package array;
import java.util.*;

public class Amaxmin {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
        
    }
    public static void main(String[] args) {
        Amaxmin obj = new Amaxmin();
        int[] arr = {3, 5, 1, 8, 2};
        ArrayList<Integer> result = obj.getMinMax(arr);
        System.out.println("Minimum: " + result.get(0));
        System.out.println("Maximum: " + result.get(1));
    }
    
}
