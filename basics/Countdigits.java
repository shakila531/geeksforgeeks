import java.util.Scanner;
class Countdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int count=0;
        while(num>0){
            int digit=num%10;
            if(digit !=0 && temp%digit==0){
                count++;
            }
            num = num/10;
        }
        System.out.println("The number of digits that divide the number is: "+count);
    }
}
