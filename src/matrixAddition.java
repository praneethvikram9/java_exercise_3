public class matrixAddition {

    public static int[][] matrixAdd(int row,int col,int[] a1, int[] a2){
        int i;
        int j;
        int k=0;
        int [][] result = new int[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                result[i][j] = a1[k]+a2[k];
                k++;
            }
        }

        return result;

    }
}
