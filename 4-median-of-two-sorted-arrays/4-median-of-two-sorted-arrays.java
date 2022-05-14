class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len = nums1.length + nums2.length; // take a length of both the arrays;
        
        int []merge = new int[len]; // make new array
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                merge[k++] = nums1[i++];  // run the for loop till one of the array exhausted
            }                             // and fill the new array in ascending order
            
            else{
                merge[k++] = nums2[j++];
            }
        }
        
        while(i<nums1.length){
            merge[k++] = nums1[i++]; // if nums1 is still left fill the new array by nums1
        }
        
        while(j<nums2.length){
            merge[k++] = nums2[j++]; // if nums2 is still left fill the new array with nums2
        }
        
        double median = 0.0;
        
        int mid = merge.length/2;
        
        if(merge.length%2 == 1){
            median = merge[mid]; // if array length is odd return mid element
        }
        
        else{
            median = (merge[mid]+merge[mid-1])/2.0; // else mid element + mid-1 element
        }
        return median;
    }
}