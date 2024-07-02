import java.util.Scanner;

public class EnBuyuEnKucukSayi {
    public static void main(String[] args) {
        int count, firstvalue,big,small,value;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç sayı girmek istersiniz:");
        count=scanner.nextInt();
        System.out.println("1. sayıyı giriniz:");
        firstvalue= scanner.nextInt();
        big=firstvalue;
        small=firstvalue;

        for (int i=2;i<=count;i++){
            System.out.println(i+". sayıyı giriniz:");
            value=scanner.nextInt();
            if (value>big){
                big=value;
            }
            if (value<small){
                small=value;
            }
        }

        System.out.println("En büyük değer:"+big);
        System.out.println("En küçük değer:"+small);
    }
}
