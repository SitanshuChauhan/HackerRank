//https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                  for(int j=0;j<(15-s1.length());j++)
                        System.out.print(" ");
                    if(x>=100)
                        System.out.print(x+"\n");
                    if(x<1)
                        System.out.print("00"+x+"\n");
                    if(x>0&&x<100)
                        System.out.print("0"+x+"\n");
               
            }
            System.out.println("================================");

    }
}



