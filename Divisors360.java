import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Divisors360{
    public static List< Integer > printDivisors(int n) {

        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for(int i =1; i <= n; i++){
            if(n % i == 0){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        List<Integer> divisors = printDivisors(num);
        System.out.println("The divisors of " + num + " are: " + divisors);
    }
}