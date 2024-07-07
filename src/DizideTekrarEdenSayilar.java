import java.util.Arrays;

public class DizideTekrarEdenSayilar {
    public static void main(String[] args) {
        int[] list={3,7,3,3,3,9,9,6,8,2,8,9,2,2};
        int[] dublicate=new int[list.length];
        int start=0;

        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if (i!=j&&list[i]==list[j]&&list[i]%2==0){
                    if (!isFind(dublicate,list[i])){
                        dublicate[start]=list[i];
                        start++;
                    }

                }
            }
        }

        System.out.println(Arrays.toString(dublicate));
        for (int i:dublicate){
            if (i!=0){
                System.out.println(i);
            }
        }
    }
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
}
