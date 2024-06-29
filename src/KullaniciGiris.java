import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kullanici="patika";
        String sifre="12345";
        System.out.println("Kullanıcı adını giriniz:");
        String username=scanner.nextLine();
        System.out.println("Şifreyi giriniz:");
        String password=scanner.nextLine();

        if (username.equals(kullanici)&&password.equals(sifre)){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        }
        else {
            System.out.println("Şifrenizi sıfırlamak istiyorsanız 1 e basınız.");
            int select=scanner.nextInt();
            if (select==1){
                System.out.println("Yeni şifre giriniz.");
                scanner.nextLine();
                String newpasword=scanner.nextLine();
                if (newpasword.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}
