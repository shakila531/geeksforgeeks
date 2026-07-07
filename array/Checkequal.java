import java.util.Arrays;

public class Checkequal {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i <a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        System.out.println(checkEqual(a, b)); // Output: true
    }
    
}
