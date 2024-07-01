import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number=scanner.nextInt();
        double total=0;
        for (int i=1;i<=number;i++){
            total+=(1.0/i);
        }
        System.out.println("Sonuç:"+total);
    }
}
