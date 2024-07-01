import java.util.Scanner;

public class CiftSayilarinToplami {
    public static void main(String[] args) {
        int total=0;
        int number=0;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Enter the number:");
            number= scanner.nextInt();
            if (number%4==0){
                total+=number;
            }
        }while (number%2==0);

        System.out.println("4 de bölünen sayıların toplamı: "+total);
    }
}
