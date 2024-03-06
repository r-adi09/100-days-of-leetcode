class Solution {
    Map<Integer, List<Integer>>hm = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            hm.put(i, new ArrayList<>());
        }
        for(int[]p : prerequisites){
            List<Integer>l = hm.getOrDefault(p[1], new ArrayList<>());
            l.add(p[0]);
            hm.put(p[1], l);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] instack = new boolean[numCourses];
        for(int i=0;i<hm.size();i++){
            if(dfscycle(i, visited, instack)==true){
                return false;
            }
        }
        return true;

    }

    public boolean dfscycle(int i, boolean[] visited, boolean[] instack){
        if(instack[i]){
            return true;
        }
        if(visited[i]){
            return false;
        }
        visited[i]=true;
        instack[i] = true;
        for(int j: hm.get(i)){
            if(dfscycle(j, visited, instack)){
                return true;
            }
        }
        instack[i] = false;

        return false;
    }
}