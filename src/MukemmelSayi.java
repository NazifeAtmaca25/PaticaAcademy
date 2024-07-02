import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number=scanner.nextInt();
        int toplam=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                toplam+=i;
            }
        }
        if (number==toplam){
            System.out.println(number+" sayısı mükemmel sayıdır.");
        }else {
            System.out.println(number+" sayısı mükemmel sayı değildir.");
        }
    }
}
