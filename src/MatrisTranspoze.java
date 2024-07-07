public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] list={{1, 2, 3},
                      {4, 5, 6}};


        int[][] duplicate=new int[list[0].length][list.length];
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list[i].length;j++){
                duplicate[j][i]=list[i][j];
            }
        }

        for (int [] row:duplicate){
            for (int i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
