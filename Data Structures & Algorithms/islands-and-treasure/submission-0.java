class Solution {
    public void islandsAndTreasure(int[][] grid) {

        int inf = 2147483647;
        int n= grid.length;
        int m = grid[0].length;
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new Pair<>(i,j));
                }
            }
        }

        while(!q.isEmpty()){
            Pair<Integer,Integer> t = q.poll();
            int i = t.getKey();
            int j = t.getValue();
            if(i+1<n && grid[i+1][j]==inf){
                grid[i+1][j]=1+grid[i][j];
                q.add(new Pair<>(i+1,j));
            }
            if(i-1>=0 && grid[i-1][j]==inf){
                grid[i-1][j]=1+grid[i][j];
                q.add(new Pair<>(i-1,j));
            }
            if(j+1<m && grid[i][j+1]==inf){
                grid[i][j+1]=1+grid[i][j];
                q.add(new Pair<>(i,j+1));
            }
            if(j-1>=0 && grid[i][j-1]==inf){
                grid[i][j-1]=1+grid[i][j];
                q.add(new Pair<>(i,j-1));
            }
        }
    }
}
