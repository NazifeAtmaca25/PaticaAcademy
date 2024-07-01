import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kümenin toplam eleman sayısını giriniz:");
        int n= scanner.nextInt();
        System.out.println("İstenilen grup sayısı:");
        int r= scanner.nextInt();
        int fN =1;
        int fR=1;
        int frn=1;

        for (int i=1;i<=n;i++){
            fN*=i;
        }
        for (int i=1;i<=r;i++){
            fR*=i;
        }
        for (int i=1;i<=(n-r);i++){
            frn*=i;
        }
        System.out.println("Sonuç:"+(fN/(fR*frn)));


    }
}
