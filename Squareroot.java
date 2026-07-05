import java.util.Scanner;
class Squareroot{
    int floorSqrt(int n) {
        // code here
        int i = 1;
        while(i*i <= n){
            i++;
        }
        return i-1;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Squareroot obj = new Squareroot();
        int result = obj.floorSqrt(num);
        System.out.println("The floor square root of " + num + " is: " + result);
    }
}
