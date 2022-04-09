//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            boolean t=checkbrackets(input);
            System.out.println(t);
		}
		
	}
    
    public static boolean checkbrackets(String input){
        Stack<Character> a=new Stack<>();
        for(char ch: input.toCharArray()){
                if(ch=='(' || ch=='[' || ch=='{'|| ch=='<'){
                    a.push(ch);
                }
                
                if(ch==')' || ch==']' || ch=='}' || ch=='>'){
                    if(a.empty())
                         return false;
                    
                    char top=a.pop();
                    
                    if((ch==')' && top!='(') || (ch=='}' && top!='{')
                        || (ch==']' && top!='[') || (ch=='>' && top!='<'))
                         return false;
                        
                }
            }
            return a.empty();
    }
}



