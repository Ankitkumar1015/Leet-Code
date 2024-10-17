class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m= image.length;
        int n=image[0].length;
        int[][] res= new int[m][n];


        for(int i=0; i<m;i++){
            for (int j=0; j<n ;j++){
                res[i][n-1-j]=image[i][j];
            }
        }
        for(int i=0; i<m;i++){
            for (int j=0; j<n ;j++){
                if(res[i][j] == 1){
                    res[i][j] = 0;
                }
                else{
                    res[i][j]=1;
                }
            }
        }
        return res;
    }
}