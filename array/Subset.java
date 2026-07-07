import java.util.Arrays;

public class Subset {
     public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0;
        int j = 0;
        while(i < a.length && j < b.length ){
            if(a[i] == b[j]){
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                return false;
            }
        }
        if(j == b.length){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        Subset obj = new Subset();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4};
        System.out.println(obj.isSubset(a, b)); // Output: true
    }
    
}
