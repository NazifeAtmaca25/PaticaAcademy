import java.util.Scanner;

public class GirilenSayiyaKadarOlanOrtalama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number= scanner.nextInt();
        int total=0;
        int counter=0;
        for (int i=0;i<=number;i++){
            if (i%12==0){
                total+=i;
                counter++;
            }
        }
        System.out.println("3 ve 4 bölünen sayıların ortalaması: "+(total/counter));
    }
}
