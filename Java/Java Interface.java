//https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true

//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum  = 0;
        for (int i = 1; i <=n/2; i++) {
            if (n % i == 0) 
                sum += i;    
        }
        sum+=n;
        return sum;
    }
}

