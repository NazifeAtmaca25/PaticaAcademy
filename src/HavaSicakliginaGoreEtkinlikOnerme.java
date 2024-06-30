import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sıcaklığını giriniz:");
        int heat=scanner.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsin.");
        }
        if (heat>=5 &&heat<15) {
            System.out.println("Sİnemaya gidebilirsin.");
        }
        if (heat>=15 && heat <25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        if (heat>=25){
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
