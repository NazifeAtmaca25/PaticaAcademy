import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Binci sayıyı giriniz:");
        a=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b=scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c=scanner.nextInt();

        if (a<b&&a<c){
            if (b<c){
                System.out.println(a+" < "+b+" < "+c);
            }
            else {
                System.out.println(a+" < "+c+" < "+b);
            }
        }
        if (b<a&&b<c){
            if(a<c){
                System.out.println(b+" < "+a+" < "+c);
            }
            else {
                System.out.println(b+" < "+c+" < "+a);
            }
        }
        if (c<b&&c<a){
            if (b<a){
                System.out.println(c+" < "+b+" < "+a);
            }
            else {
                System.out.println(c+" < "+a+" < "+b);
            }
        }
    }
}
