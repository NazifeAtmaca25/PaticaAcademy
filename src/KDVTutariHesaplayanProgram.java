import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Fiyat giriniz:");
        int fiyat= scanner.nextInt();
        if (fiyat<=1000) {
            double kdv = (fiyat * 18) / 100;
            System.out.println("KDV:" + kdv);
            System.out.println("KDV'li tutar:" + (fiyat + kdv));
        }
        else {
            double kdv = (fiyat * 8) / 100;
            System.out.println("KDV:" + kdv);
            System.out.println("KDV'li tutar:" + (fiyat + kdv));
        }
    }
}
