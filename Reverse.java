import java.util.Scanner;
class Reverse{
    public static int reverseDigits(int n) {
        // Code here
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev *10 + digit;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int reversedNumber = reverseDigits(num);
        System.out.println("The reversed number is: " + reversedNumber);
    }

}
    
