//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
