class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter,
                                int x1, int y1, int x2, int y2) {
        
      
        int closestX = Math.min(Math.max(xCenter, x1), x2);
        int closestY = Math.min(Math.max(yCenter, y1), y2);
        
      
        int dx = closestX - xCenter;
        int dy = closestY - yCenter;
        
        return dx * dx + dy * dy <= radius * radius;
    }
}
