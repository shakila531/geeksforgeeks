import java.util.Scanner;
class Power{
    public int reverseExponentiation(int n) {
        // code here
        int temp = n;
        int rev = 0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
            
        }
        int result = 1;
        for(int i = 1; i <= rev; i++){
            result = result * n;
        }
        return result;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Power obj = new Power();
        int result = obj.reverseExponentiation(num);
        System.out.println("The result of raising the number to the power of its reverse is: " + result);
    }

}
