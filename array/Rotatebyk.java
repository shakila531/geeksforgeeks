import java.util.ArrayList;

public class Rotatebyk {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = k; i < n; i++){
            ans.add(arr.get(i));
        }
        for(int i =0; i < k; i++){
            ans.add(arr.get(i));
        }
        return ans;
    

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 2;
        ArrayList<Integer> rotatedArr = rotateArray(arr, k);
        System.out.println(rotatedArr); // Output: [3, 4, 5, 1, 2]
    }
}
