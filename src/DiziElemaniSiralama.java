import java.util.Arrays;
import java.util.Scanner;

public class DiziElemaniSiralama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz:");
        int number=scanner.nextInt();
        int[] list=new int[number];
        for (int i=0;i<number;i++){
            System.out.println("Bir sayı giriniz:");
            list[i]=scanner.nextInt();
        }
        sortArray(list);
        print(list);
    }

    static int[] sortArray(int[] arr){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    static void print(int[] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
