import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taban,us;
        System.out.println("Üssün tabanını giriniz:");
        taban=scanner.nextInt();
        System.out.println("Üssü giriniz:");
        us=scanner.nextInt();
        System.out.println("Sonuç:"+usluSayi(taban,us));
    }


    static int usluSayi(int a,int b){
        if (b==0){
            return 1;
        }else {
            return a*usluSayi(a,b-1);
        }
    }
}
