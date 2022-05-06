// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        String convert = String.valueOf(num);
        
        char c[] = convert.toCharArray();
        
        for(int i=0; i<c.length; i++){
            if(c[i] == '0'){
                c[i] = '5';
            }
        }
        
        String res = new String(c);
        
        int resint = Integer.parseInt(res);
        
        return resint;
        
    }
}