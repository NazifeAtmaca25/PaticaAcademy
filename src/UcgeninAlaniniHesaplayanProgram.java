import java.util.Scanner;

public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz:");
        int a=scanner.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz:");
        int b=scanner.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz:");
        int c=scanner.nextInt();

        double u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:"+alan);
    }
}
