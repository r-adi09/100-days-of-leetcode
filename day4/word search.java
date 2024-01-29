class Solution {
    public boolean exist(char[][] board, String word) {
        boolean res=false;

        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        //loop through the matrix and call dfs function on each cell
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                res = dfs(board, i, j, rows, cols, visited, word, 0);
                if(res==true){
                    return res;
                }
            }
        }
        return res;
    }

    public boolean dfs(char[][]board, int i, int j, int rows, int cols, boolean[][]visited, String word, int k){
        boolean res = false;
        if(k==word.length()){
            return true;
        }
        char x = word.charAt(k);
        if(i<0 || j<0 || i>=rows || j>=cols || board[i][j]!=word.charAt(k) || visited[i][j]==true){
            return false;
        }
        visited[i][j] = true;
        //if(i <= rows-2 && i>0)

        res = dfs(board, i+1, j, rows, cols, visited, word, k+1) ||
                dfs(board, i-1, j, rows, cols, visited, word, k+1) ||
                dfs(board, i, j+1, rows, cols, visited, word, k+1) ||
                dfs(board, i, j-1, rows, cols, visited, word, k+1);
        visited[i][j] = false;
        return res;
    }
}