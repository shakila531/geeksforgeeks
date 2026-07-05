import java.util.Scanner;
class Perfectnum{
    static boolean isPerfect(int n) {
        // code here
        if(n == 1){
            return false;
        }
        int sum= 1;
        for(int i = 2;i < Math.sqrt(n); i++){
            if(n % i == 0){
                sum = sum + i;
                if(i != n /i){
                    sum = sum + n/i;
                }
            }
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean result = isPerfect(num);
        if(result){
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }
    }
}
