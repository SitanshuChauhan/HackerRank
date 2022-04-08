//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        int i;
        for(i=0; i<=s.length()-k; i++ ){
           
            if (smallest.compareTo( s.substring(i,k+i))>0){
                smallest =  s.substring(i,k+i);
            }
            if(largest.compareTo( s.substring(i,k+i))<0){
                largest= s.substring(i,k+i);
            }
            }
        
        
        return smallest + "\n" + largest;
    }

