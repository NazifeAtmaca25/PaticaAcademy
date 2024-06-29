import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik notunu giriniz:");
        int matematik=scanner.nextInt();
        System.out.println("Fizik notunuz giriniz:");
        int fizik=scanner.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        int turkce= scanner.nextInt();
        System.out.println("Kimya notunuz giriniz:");
        int kimya= scanner.nextInt();
        System.out.println("Müzik notunu giriniz:");
        int muzik= scanner.nextInt();
        double ortalama=0;
        int counter=0;
        if (matematik<=100){
            ortalama+=matematik;
            counter++;
        }
        if (fizik<=100){
            ortalama+=fizik;
            counter++;
        }
        if (turkce<=100){
            ortalama+=turkce;
            counter++;
        }
        if (kimya<=100){
            ortalama+=kimya;
            counter++;
        }
        if (muzik<=100){
            ortalama+=muzik;
            counter++;
        }
        System.out.println("Ortalaman: "+(ortalama/counter));
        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else {
            System.out.println("sınıftan kaldınız");
        }
    }
}
