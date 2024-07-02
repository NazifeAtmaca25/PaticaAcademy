import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç basamaklı olmasını istersiniz:");
        int basamak= scanner.nextInt();
        a=0;
        b=1;
        System.out.print(basamak+ " Elamanlı Fibonacci serisi:"+a+" "+b);
        for (int i=1;i<=basamak-1;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }
    }
}
