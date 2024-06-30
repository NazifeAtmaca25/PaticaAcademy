import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gideceğiniz yerin kilometresini yazınız:");
        int km=scanner.nextInt();
        System.out.println("Yaşınızı giriniz:");
        int age= scanner.nextInt();
        System.out.println("Yolculuk tipini seçiniz \n Tek yön->1 \n Gidiş dönüş ->2");
        int choice=scanner.nextInt();
        double tutar=0;

        if (km<0||age<0||choice>3){
            System.out.println("Hatalı veri girdiniz.");
        }else {
            tutar=km*0.1;
            if (age < 12) {
                tutar=tutar/2;
            }
            if (age>=12&&age<25){
                tutar=(tutar*9)/10;
            }
            if (age>65){
                tutar=(tutar*7)/10;
            }
            if (choice==2){
                tutar=(tutar*16)/10;
            }
            System.out.println("Toplam tutar: "+tutar);

        }

    }
}
