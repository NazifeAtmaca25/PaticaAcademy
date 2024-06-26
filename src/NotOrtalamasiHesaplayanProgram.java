import java.util.Scanner;
/*
* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise
* ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.*/

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik:");
        int matematik=scanner.nextInt();

        System.out.println("Fizik:");
        int fizik=scanner.nextInt();

        System.out.println("Kimya:");
        int kimya=scanner.nextInt();

        System.out.println("Türkçe:");
        int turkce=scanner.nextInt();

        System.out.println("Tarih:");
        int tarih=scanner.nextInt();

        System.out.println("Müzik:");
        int muzik=scanner.nextInt();
        System.out.println();
        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama:"+ortalama);
        System.out.println();
        if (ortalama>=60){
            System.out.println("Sınıfı geçti.");
        }
        else {
            System.out.println("Sınıfta kaldı.");
        }
    }
}
