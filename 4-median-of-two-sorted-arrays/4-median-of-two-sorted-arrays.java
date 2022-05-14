class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len = nums1.length + nums2.length;
        
        int []merge = new int[len];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                merge[k++] = nums1[i++]; 
            }
            
            else{
                merge[k++] = nums2[j++];
            }
        }
        
        while(i<nums1.length){
            merge[k++] = nums1[i++];
        }
        
        while(j<nums2.length){
            merge[k++] = nums2[j++];
        }
        
        double median = 0.0;
        
        int mid = merge.length/2;
        
        if(merge.length%2 == 1){
            median = merge[mid];
        }
        
        else{
            median = (merge[mid]+merge[mid-1])/2.0;
        }
        return median;
    }
}