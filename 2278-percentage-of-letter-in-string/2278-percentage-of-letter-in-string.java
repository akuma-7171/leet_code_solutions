class Solution {
   public int percentageLetter(String s, char letter) {
       
        int n = s.length();
       
        double ans = 0;
       
        HashMap<Character,Integer> freq = new HashMap<>();
       
        for(int i=0;i<n;i++)
        {
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
       
        if(freq.containsKey(letter))
        {
            double p = freq.get(letter);
            ans = (p/n)*100;
        }
       
        ans = Math.floor(ans);
       
        return (int)ans;
       
    }
 }
