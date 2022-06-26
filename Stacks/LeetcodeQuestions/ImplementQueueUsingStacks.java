package Stacks.LeetcodeQuestions;

import java.util.Stack;

public class ImplementQueueUsingStacks {

//    https://leetcode.com/problems/implement-queue-using-stacks/

    class MyQueue {

        Stack<Integer> st1;
        Stack<Integer> st2;

        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            st1.push(x);
        }

        public int pop() {

            if(st2.isEmpty())
                fill();

            return st2.pop();

        }

        public void fill(){

            while(!st1.isEmpty())
                st2.push(st1.pop());

        }

        public int peek() {

            if(st2.isEmpty())
                fill();
            return st2.peek();

        }

        public  boolean empty() {
            if(st1.isEmpty() && st2.isEmpty())
                return true;
            return false;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

}
