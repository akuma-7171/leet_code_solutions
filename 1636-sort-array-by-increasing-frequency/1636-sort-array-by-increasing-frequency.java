class Solution {
     public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new MyComparator());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }
        
        int[] ans = new int[n];
        int i = 0;
        while(!pq.isEmpty()) {
            int k = pq.peek().getKey();
            int v = pq.poll().getValue();
            while(v-- > 0) {
                ans[i++] = k;
            }
        }
        return ans;
    }
}

class MyComparator implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if(m1.getValue() != m2.getValue()) return m1.getValue() - m2.getValue();
        else return m2.getKey() - m1.getKey();
    }
}