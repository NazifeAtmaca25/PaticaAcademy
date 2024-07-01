import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int number,ust;
        int total=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        number=scanner.nextInt();
        System.out.println("Üs olacak sayı:");
        ust=scanner.nextInt();
        for (int i=1;i<=ust;i++){
            total*=number;
        }
        System.out.println("Sonuç:"+total);
    }
}
