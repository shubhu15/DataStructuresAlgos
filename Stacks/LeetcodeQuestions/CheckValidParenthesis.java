package Stacks.LeetcodeQuestions;

import java.util.Stack;

public class CheckValidParenthesis {

//    https://leetcode.com/problems/valid-parentheses/
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i =0; i<s.length();i++){

            if(!st.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')){

                char c = st.peek();

                if(c == '(' && s.charAt(i)==')' )
                {
                    st.pop();
                }

                else if(c == '[' && s.charAt(i)==']' )
                {
                    st.pop();
                }

                else if(c == '{' && s.charAt(i)=='}' )
                {
                    st.pop();
                }
                else
                    st.push(s.charAt(i));



            }
            else
                st.push(s.charAt(i));



        }


        return st.isEmpty();
    }

//other approach
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}
