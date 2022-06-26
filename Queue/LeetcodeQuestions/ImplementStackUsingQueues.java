package Queue.LeetcodeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

//    https://leetcode.com/problems/implement-stack-using-queues/  - using 1 queue - rotating during push
    class MyStack {

        Queue<Integer> q1;


        public MyStack() {

            q1 = new LinkedList<>();
        }

        public void push(int x) {
            q1.add(x);
            for(int i =1; i<q1.size();i++)
                q1.add(q1.remove());
        }

        public int pop() {
            return q1.remove();
        }



        public int top() {

            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
