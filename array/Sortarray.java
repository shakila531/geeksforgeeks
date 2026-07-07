import java.util.*;
class Sortarray{
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int num : arr){
            if(num == 0){
                zero++;
            }
            else if(num == 1){
                one++;
            }
            else{
                two++;
            }
        }
        int i = 0;
        while(zero > 0){
            arr[i++] = 0;
            zero--;
        }
        while(one > 0){
            arr[i++] = 1;
            one--;
            
        }
        while(two > 0){
            arr[i++] = 2;
            two--;
        }
    }
    public static void main(String[] args) {
        Sortarray sorter = new Sortarray();
        int[] arr = {0, 1, 2, 0, 1, 2};
        sorter.sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}