import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Merak ettiğiniz yılı giriniz:");
        int year =scanner.nextInt();
        if (year%4==0){
            System.out.println(year+ " yılı artık yıldır.");
        } else{
            System.out.println(year+" yılı artık yıl değildir.");
        }
    }
}
