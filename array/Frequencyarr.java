import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Frequencyarr {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int[] freq = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]-1]++;
        }
        for(int i = 0; i < arr.length; i++){
            result.add(freq[i]);
            
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Frequencyarr obj = new Frequencyarr();
        List<Integer> result = obj.frequencyCount(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
