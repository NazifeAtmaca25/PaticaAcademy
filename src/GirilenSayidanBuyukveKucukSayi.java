import java.util.Scanner;

public class GirilenSayidanBuyukveKucukSayi {
    public static void main(String[] args) {
        int[] numbers={15,12,788,1,-1,-778,2,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a=scanner.nextByte();
        int minValue = numbers[0], maxValue=numbers[0];
        int minDiff =Math.abs( a-numbers[0]);
        int maxDiff=Math.abs(numbers[0]-a);
        for (int i:numbers){
            if (i<a){
                if (Math.abs(a-i)<minDiff){
                    minDiff=Math.abs(a-i);
                    minValue=i;
                }
            }
            if (a<i){
                if (Math.abs(i-a)<maxDiff){
                    maxDiff=Math.abs(i-a);
                    maxValue=i;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı:"+ minValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı:"+maxValue);


    }
}

