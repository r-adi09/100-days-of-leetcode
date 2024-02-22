class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(bfs(graph, color, i)==false){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean bfs(int[][] graph, int[] color, int idx){
        Queue<Integer>q = new LinkedList<>();
        q.add(idx);
        color[idx]=0;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int i=0;i<graph[u].length;i++){
                if(color[u]!=-1 && color[u]==color[graph[u][i]]){
                    return false;
                }
                else if(color[graph[u][i]]==-1){
                    color[graph[u][i]] = (color[u]==0)?1:0;
                    q.add(graph[u][i]);
                }
            }
        }
        return true;
    }
}