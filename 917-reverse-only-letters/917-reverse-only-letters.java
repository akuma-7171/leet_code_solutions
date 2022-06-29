class Solution {
    public String reverseOnlyLetters(String s) {
        
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i <= j) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                i++;
                continue;
                
            } else if (!Character.isAlphabetic(s.charAt(j))) {
                j--;
                continue;
                
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();
    }
        
}
