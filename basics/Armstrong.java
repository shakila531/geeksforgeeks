import java.util.Scanner;
class Armstrong{
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum =0;
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
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
        boolean result = armstrongNumber(num);
        if(result){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
