class Solution {
    public int canBeTypedWords(String t, String bl) {
        
        int count = 0;
        
        String[] arr = t.split(" ");
        
      for(int i=0; i<arr.length; i++){
          for(char c : bl.toCharArray()){
              
              if(arr[i].indexOf(c) != -1){
                  count++;
                  break;
              }
              
          }
      }
        
        return arr.length-count;
    }
}