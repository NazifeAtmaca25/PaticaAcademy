import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int n1= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int n2= scanner.nextInt();
        int ebob=0;
        int temp =n1;

        while (temp>1){
            if (n1%temp==0&&n2%temp==0){
                ebob=temp;
                System.out.println("EBOB:"+ebob);
            }
            temp--;
        }

        System.out.println("EKOK:" +((n1*n2)/ebob));
    }
}
