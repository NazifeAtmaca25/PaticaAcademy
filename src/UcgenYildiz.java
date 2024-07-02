import java.util.Scanner;

public class UcgenYildiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = scanner.nextInt();
        for (int i=0;i<number;i++){
            for (int j=1;j<=(number-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
