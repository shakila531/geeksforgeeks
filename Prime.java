import java.util.Scanner;
class Prime{
    static boolean isPrime(int n) {
     boolean isprime = true;
        if(n <= 1){
            isprime = false;
        }
        else{
            for(int i = 2; i <= n/2; i++){
                if(n % i ==0){
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime){
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
        boolean result = isPrime(num);
        if(result){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
    
}
