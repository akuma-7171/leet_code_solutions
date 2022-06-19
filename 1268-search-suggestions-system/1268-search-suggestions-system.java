class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        List<List<String>> res = new ArrayList<>();
        
        Arrays.sort(products);
        
        for(int i=0; i<searchWord.length(); i++){
            
            String prefix = searchWord.substring(0,i+1);
            
            int index = Arrays.binarySearch(products,prefix);
            
            if(index < 0){
                index = -index-1;
            }
            
            List<String> curr = new ArrayList<>();
            
            int max = index+3;
            
            for(int j=index; j<products.length; j++){
                
                if(j==max){
                    break;
                }
                
                if(products[j].startsWith(prefix)){
                    curr.add(products[j]);
                }
                
            }
            
            res.add(curr);
            
        }
        return res;
    }
}