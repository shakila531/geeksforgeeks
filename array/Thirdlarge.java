package array;
import java.util.*;

public class Thirdlarge {
     public int thirdLargest(List<Integer> arr) {
        // code here
        if(arr.size() < 3){
            return -1;
        }
        Collections.sort(arr);
        return arr.get(arr.size() - 3);
    }
    public static void main(String[] args) {
        Thirdlarge obj = new Thirdlarge();
        List<Integer> arr = Arrays.asList(3, 5, 1, 8, 2);
        int result = obj.thirdLargest(arr);
        System.out.println("Third Largest: " + result);
    }
    
}
