import java.util.Scanner;
class Lastdigit{
    public int getLastDigit(String a, String b) {
        
        // code here

        if (b.equals("0"))
            return 1;

        int lastDigit = a.charAt(a.length() - 1) - '0';

        int power = 0;

        for (int i = 0; i < b.length(); i++) {
            power = (power * 10 + (b.charAt(i) - '0')) % 4;
        }

        if (power == 0)
            power = 4;

        int ans = 1;

        for (int i = 0; i < power; i++) {
            ans = ans * lastDigit;
        }

        return ans % 10;
    
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        String num1 = sc.next();
        String num2 = sc.next();
        Lastdigit obj = new Lastdigit();
        int result = obj.getLastDigit(num1, num2);
        System.out.println("The last digit of " + num1 + " raised to the power of " + num2 + " is: " + result);
    }
}
