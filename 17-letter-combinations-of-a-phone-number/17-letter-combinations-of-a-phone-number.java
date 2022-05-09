class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        
        if(digits == null || digits.length() == 0){
            return res;
        }
        
        String[] mapping = {
            
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
            
        };
        
        lettercombination(res, digits, "", 0, mapping);
        return res;
        
        
        
    }
    
    public void lettercombination(List<String> res, String digits, String current, int index, String[] mapping){
        if(index == digits.length()){
            res.add(current);
            return;
        }
        
        String letter = mapping[digits.charAt(index)-'0'];
        
        for(int i=0; i<letter.length(); i++){
            lettercombination(res, digits, current+letter.charAt(i), index+1, mapping);
        }
        
    }
}