//https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int i=1;
        while (s.hasNextLine()){
            System.out.println(i+" "+s.nextLine());
            i++;
        }
    }
}
