import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armuttan kaç kilo aldınız:");
        int armut=scanner.nextInt();
        System.out.println("Elmadan kaç kilo aldınız:");
        int elma=scanner.nextInt();
        System.out.println("Domatesten kaç kilo aldınız:");
        int domates=scanner.nextInt();
        System.out.println("Muzdan kaç kilo aldınız:");
        int muz=scanner.nextInt();
        System.out.println("Patlıcandan kaç kilo aldınız:");
        int patlican=scanner.nextInt();

        double total=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println("Toplam tutar: "+total);
    }
}
