import java.util.Scanner;

public class GirilenSayidanKucukDortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number= scanner.nextInt();
        System.out.println("Dördün kuvvetleri");
        for (int i=1; i<=number;i*=4){
            System.out.println(i);
        }
        System.out.println("Beşin kuvvetleri");
        for (int j=1;j<=number;j*=5){
            System.out.println(j);
        }
    }
}
