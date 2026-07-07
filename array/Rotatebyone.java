public class Rotatebyone {
    public void rotate(int[] arr) {
        // code here
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        
    }
    public static void main(String[] args) {
        Rotatebyone rotator = new Rotatebyone();
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr);
        System.out.println(Arrays.toString(arr)); // Output: [5, 1, 2, 3, 4]
    }
    
}
