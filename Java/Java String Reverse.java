//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i,t;
        for(i=0,t=A.length()-1;i<A.length();i++,t--){
            if(A.charAt(t)==A.charAt(i)){
               continue;
            }
            else
            break;
        }
        if(t==-1)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}



