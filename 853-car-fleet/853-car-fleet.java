class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<position.length;i++)
        {
            mp.put(position[i],speed[i]);
        }
        
        Arrays.sort(position);
        
        int count=0;
        int k=position.length-1;
        float ans=(float)-1;
       
        while(k>=0)
        {
            int dist=target-position[k];
            int sp=mp.get(position[k]);
            float time=(float)dist/sp;
            if(ans==-1)
            {
                ans=time;
                
            }
            else if(time<=ans)
            {
                k--;
                continue;
            }
            else
            {
                ans=-1;
                continue;
            }
            
            count++;
            k--;
        
        }
        return count;
        
        
    }
}