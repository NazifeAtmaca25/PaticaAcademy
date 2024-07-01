import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       String name,pasword;
       int right=3;
       int balance=1500;
       int select;
       while (right>0){
           System.out.println("Kullancı adını giriniz:");
           name=scanner.nextLine();
           System.out.println("Parolanızı giriniz:");
           pasword=scanner.nextLine();
           if (name.equals("patika")&&pasword.equals("12345")){
               System.out.println("Patika Bankamatiğe Hoşgeldiniz");

               do {
                   System.out.println("1->Para yatırma \n2->Para çekme \n3->Bakiye Sorgula \n4->Çıkış yap");
                   System.out.println("Yapmak istediğiniz işlemi seçiniz...");
                   select=scanner.nextInt();
                   switch (select) {
                       case 1 -> {
                           System.out.println("Yatırmak istediğiniz mevlayı giriniz:");
                           int price = scanner.nextInt();
                           balance += price;
                       }
                       case 2 -> {
                           System.out.println("Ne kadar çekmek istiyorsunuz.");
                           int price1 = scanner.nextInt();
                           balance -= price1;
                       }
                       case 3 -> System.out.println("Güncel bakiyeniz:" + balance);
                   }
               }while (select!=4);
               System.out.println("Tekrar görüşmek üzere...");
               break;
           }else {
               right--;
               System.out.println("Hatalı giriş...Lütfen tekrar deneyiniz.");
               if (right==0){
                   System.out.println( "Hesabınız bloke olmuştur lütfen bankanızla iletişime geçininiz...");
               }else {
                   System.out.println("Kalan hakkınız :"+right);
               }
           }
       }
    }
}
