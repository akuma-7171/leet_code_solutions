class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color) return image;
        
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    public void dfs(int[][] image, int r, int c, int color, int cur){
        
        if(r<0 || r>=image.length || c<0 || c>=image[0].length) return;
        
        if(cur != image[r][c]) return;
        
        image[r][c] = color;
        
        dfs(image, r+1, c, color, cur);
        dfs(image, r-1, c, color, cur);
        dfs(image, r, c+1, color, cur);
        dfs(image, r, c-1, color, cur);
        
    }
    
}