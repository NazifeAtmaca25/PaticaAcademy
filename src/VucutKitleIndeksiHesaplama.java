import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double m=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        int kg=scanner.nextInt();

        double vki=kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz :"+vki);
    }
}
