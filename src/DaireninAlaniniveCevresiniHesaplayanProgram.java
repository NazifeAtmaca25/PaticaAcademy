import java.util.Scanner;

public class DaireninAlaniniveCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz:");
        int radius=scanner.nextInt();
        System.out.println("Çemberin derecesini girin:");
        int derece=scanner.nextInt();
         double alan=(3.14*radius*radius*derece)/360;
        System.out.println("Alan: "+alan);
    }
}
