public class PolindromSayiBulma {
    public static void main(String[] args) {

        System.out.println("1:"+isPolindrom(1));
        System.out.println("4:"+isPolindrom(4));
        System.out.println("8:"+isPolindrom(8));
        System.out.println("98:"+isPolindrom(98));
        System.out.println("101:"+isPolindrom(101));
        System.out.println("363:"+isPolindrom(363));
        System.out.println("400:"+isPolindrom(400));
        System.out.println("9889:"+isPolindrom(9889));


    }
    static boolean isPolindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==reverseNumber){
            return true;
        }else{
            return false;
        }

    }
}
