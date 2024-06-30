import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz:");
        int mounth= scanner.nextInt();
        System.out.println("Doğduğunuz günü giriniz:");
        int day= scanner.nextInt();

        if (mounth==1){
            if (day>0&&day<22){
                System.out.println("Oğlak burcu");
            }
            else if (day>21&&day<32){
                System.out.println("Kova burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        }
         else if (mounth==2){
            if (day>0&&day<20){
                System.out.println("Kova burcu");
            }
            else if (day>19&&day<29){
                System.out.println("Balık burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        }
        else if (mounth==3){
            if (day>0&&day<21){
                System.out.println("Balık burcu");
            }
            else if(day>20&&day<32){
                System.out.println("Koç burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==4) {
            if (day>0&&day<21){
                System.out.println("Koç burcu");
            }
            else if (day>20&&day<31){
                System.out.println("Boğa burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==5) {
            if (day<22&&day>0){
                System.out.println("Boğa burcu");
            }
            else if (day>21&&day<32){
                System.out.println("İkizler burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==6) {
            if (day>0&&day<23){
                System.out.println("İkizler burcu");
            }
            else if (day>22&&day<31){
                System.out.println("Yengeç burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==7) {
            if (day>0&&day<23){
                System.out.println("Yengeç burcu");
            }
            else if (day>22&&day<32){
                System.out.println("Aslan burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==8) {
            if (day>0&&day<23){
                System.out.println("Aslan burcu");
            }
            else if (day>22&&day<32){
                System.out.println("Başak burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==9) {
            if (day>0&&day<23){
                System.out.println("Başak burcu");
            }
            else if (day>22&&day<31){
                System.out.println("Terazi burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==10){
            if (day>0&&day<23){
                System.out.println("Terazi burcu");
            }
            else if (day>22&&day<32){
                System.out.println("Akrep burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==11){
            if (day>0&&day<22){
                System.out.println("Akrep burcu");
            }
            else if (day>21&&day<31){
                System.out.println("Yay burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        } else if (mounth==12) {
            if (day>0&&day<22){
                System.out.println("Yay burcu");
            }
            else if (day>21&&day<32){
                System.out.println("Oğlak burcu");
            }
            else {
                System.out.println("Geçerli bi değer giriniz");
            }
        }
    }
}
