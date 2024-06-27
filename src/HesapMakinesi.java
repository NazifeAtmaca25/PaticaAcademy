import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int number1= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int number2=scanner.nextInt();
        System.out.println("Toplama için 1 \nÇıkarma için 2 \nÇarpma için 3 \nBölme için 4 ");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        int select=scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpım: "+(number1*number2));
                break;
            case 4:
                System.out.println("Bölme: "+(number1/number2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");

        }

    }
}
