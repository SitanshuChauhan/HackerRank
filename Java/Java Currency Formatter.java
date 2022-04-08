//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale INDIA = new Locale("en", "IN");
        Locale US=new Locale("en","US");
        Locale CHINA=new Locale("zh","CN");
        Locale FRANCE=new Locale("fr","FR");
        
        String us = NumberFormat.getCurrencyInstance(US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
