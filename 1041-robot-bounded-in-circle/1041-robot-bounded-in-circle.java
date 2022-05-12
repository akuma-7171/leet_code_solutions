class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int x=0,y=0;
        int dir=0;
        int tryCount=4;
        while(tryCount-- >0){
            for(int i=0; i<instructions.length();i++){
                switch(instructions.charAt(i)){
                    case 'G':
                        switch(dir){
                            case 0: y++; break;
                            case 1: x++; break;
                            case 2: y--; break;
                            case 3: x--; break;
                        }
                        break;
                    case 'L': dir--; if(dir<0)dir+=4;break;
                    case 'R': dir++; if(dir>=4)dir-=4;break;
                }
            }
            if(x==0&&y==0) return true;
        }
        
        return false;
        
        
        
        
        
    }
}