class Solution {
    public void setZeroes(int[][] matrix) {
        int rowsize = matrix[0].length;
        int colsize = matrix.length; 

        int[] rowarr = new int[rowsize];
        int[] colarr = new int[colsize];

        for(int i=0;i<colsize;i++){
            for(int j=0;j<rowsize;j++){
                   if(matrix[i][j]==0){
                    rowarr[j]=1;
                    colarr[i]=1;
                }
            }
        }
        for (int i = 0; i < colarr.length; i++) {
            for (int j = 0; j < rowarr.length; j++) {
                if(rowarr[j]==1){
                    matrix[i][j]=0;
                }
                if(colarr[i]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

}