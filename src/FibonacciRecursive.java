import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number=scanner.nextInt();
        System.out.println(fibonacci(number));
    }
    static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
