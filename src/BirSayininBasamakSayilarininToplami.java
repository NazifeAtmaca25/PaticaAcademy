import java.util.Scanner;

public class BirSayininBasamakSayilarininToplami {
    public static void main(String[] args) {
        int basamak=0;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number=scanner.nextInt();
        int temp=number;
        while(temp!=0){
            temp/=10;
            basamak++;
        }
        for (int i=1;i<=basamak;i++){
          toplam+= number%10;
          number/=10;
        }
        System.out.println("Sonuç:"+toplam);
    }
}
