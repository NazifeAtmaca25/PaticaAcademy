public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list={10, 20, 20, 10, 10, 20, 5, 20};
        sortArray(list);
        int repeat=1;

        for (int i=0;i< list.length-1;i++){
            if (list[i]==list[i+1]){
                repeat++;
            }else {
                System.out.println(list[i]+" sayısı "+repeat+ " kere tekrar edildi.");
                repeat=1;
            }
        }
        System.out.println(list[list.length - 1] + " sayısı " + repeat + " kere tekrar edildi.");

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
}
