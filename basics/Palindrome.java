import java.util.Scanner;
class Palindrome{
    public boolean isPalindrome(int n) {
        // code here
        int temp = n;
        int rev=0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev *10 + digit;
            temp = temp / 10;
        }
        if(rev == n){
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
        Palindrome obj = new Palindrome();
        boolean result = obj.isPalindrome(num);
        if(result){
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}
