class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        boolean [][]digged = new boolean[n][n];
        int cnt = 0;
        int flag = false;
        int[][]pts = new int[4][2];
        for(int[]d : dig){
            int x = d[0];
            int y = d[1];
            digged[x][y] = true;
        }

        for(int[] d : artifacts){
            int x1 = d[0];
            int x2 = d[1];
            int x3 = d[2];
            int x4 = d[3];
            if(x1 == x3 && x2 == x4){
                if(digged[x1][x2] == true){
                    cnt++;
                }
            }
            for(int i=x1;i<x3;i++){
                for(int j=x2;j<x4;j++){
                    if(digged[i][j]==true){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                }
            }
            if(flag == true){
                cnt++;
            }
        }
        return cnt;
    }
}