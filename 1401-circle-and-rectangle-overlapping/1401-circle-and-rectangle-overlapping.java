   class Solution {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        
        int y = (y2 >= y_center && y1 <= y_center) ? 0 : Math.min(Math.abs(y2 - y_center), Math.abs(y1-y_center));
        
        int x = (x2 >= x_center && x1 <= x_center) ? 0 : Math.min(Math.abs(x2 - x_center), Math.abs(x1 - x_center));
        
        if (x * x + y*y <= radius * radius){
            return true;
        }
        
        return false;
        
    }
}
