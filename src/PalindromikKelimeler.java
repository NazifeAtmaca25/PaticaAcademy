public class PalindromikKelimeler {
    static boolean isPalindrom(String str){
        int i=0, j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindrom2(String str){
        String reverse="";
        for (int i=str.length()-1;i>-1;i--){
            reverse+=str.charAt(i);
        }
        if (reverse.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("abba"));
        System.out.println(isPalindrom2("kavak"));
    }
}
