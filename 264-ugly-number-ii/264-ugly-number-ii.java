class Solution {
       public int nthUglyNumber(int n) {
        TreeSet<Long> pq=new TreeSet<>();
        int i=1;
        pq.add(1L);
        while(i<n)
        {
            long temp=pq.pollFirst();
            pq.add(temp*2);
            pq.add(temp*3);
            pq.add(temp*5);
            i++;
        }
        long ret=(pq.pollFirst());
        return (int)ret;
    }

}