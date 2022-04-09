//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int i,j,d;
        int n=s.nextInt();
        
        for(i=0;i<n;i++){
            a.add(new ArrayList<>());
             d=s.nextInt();
            for(j=0;j<d;j++){
                a.get(i).add(j, s.nextInt());
            }
        }
        int q=s.nextInt(),x,y;
        for(i=0;i<q;i++){
            x=s.nextInt();
            y=s.nextInt();
            if(y>a.get(x-1).size())
            System.out.println("ERROR!");
            else
            System.out.println(a.get(x-1).get(y-1));
        }
    }
}
