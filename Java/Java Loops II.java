//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
              int k,j;
            for(k=0;k<n;k++){
                
                int b1=0;
                for(j=0;j<k+1;j++){
                    b1=b1+((int)Math.pow(2,j)*b);
                }
                System.out.print(a+b1+" ");
                }
            System.out.print("\n");
        }
        in.close();
        
      
    }
}
