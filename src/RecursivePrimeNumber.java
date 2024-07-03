import java.util.Scanner;

public class RecursivePrimeNumber {
    static boolean isPrime(int number,int divisor){
        if(divisor == number){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        return isPrime(number,divisor+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();


        if (isPrime(number, 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
