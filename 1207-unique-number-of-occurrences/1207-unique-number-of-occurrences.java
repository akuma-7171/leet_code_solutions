class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        Map <Integer, Integer> map = new HashMap(); 
        
        HashSet <Integer> set = new HashSet(); 
                
        for(int i : arr)
        {
           
            map.put(i, map.getOrDefault(i,0)+1);
           
        }
		
        for(int element : map.values()) 
        {
            set.add(element);
        }
        
        if(set.size() == map.size()) 
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
 }