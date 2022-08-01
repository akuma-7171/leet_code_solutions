class Solution {
    public boolean halvesAreAlike(String s) {
        
        String first = s.substring(0,s.length()/2);
        String second = s.substring(s.length()/2, s.length());
        
        int one = 0;
        int two = 0;
        
        for(int i=0; i<first.length(); i++){
            if(check(first.charAt(i))){
                one++;
            }
            
            if(check(second.charAt(i))){
                two++;
            }
        }
        
        return one == two;
        
        
    }
    
    public boolean check(char c){
        
        if(c == 'a' || c == 'i' || c == 'e' || c == 'o'|| c == 'u' || c == 'A' || c == 'I'|| c == 'E' || c == 'U' || c == 'O'){
            return true;
        }
        
        return false;
        
    }
    
}