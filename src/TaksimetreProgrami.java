import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gidilen Kilometre:");
        int km=scanner.nextInt();
        double tutar=10+km*2.2;
        if (tutar<=20){
            System.out.println("Ödenecek tutar: 20");
        }
        else{
            System.out.println("Ödenecek tutar:"+tutar);
        }
    }
}
