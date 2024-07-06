public class DizilerdeHarmonikOrtalama {
    public static void main(String[] args) {
        int[] number={1, 2, 3, 4, 5};
        double harmonik=0;
        for (int i=0;i<number.length;i++){
            harmonik+=((double) 1 /number[i]);
        }
        System.out.println("Harmonik ortalama:"+harmonik);
    }
}
