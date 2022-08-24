package Trie;

public class ImplementTrie1 {

//    https://leetcode.com/problems/implement-trie-prefix-tree/
    class Trie {

        Node root ;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {

            Node node = root;
            for(char c : word.toCharArray()){

                if(!node.containsKey(c))
                    node.put(c, new Node());

                node = node.get(c);

            }
            node.setEnd();

        }

        public boolean search(String word) {

            Node node = root;
            for(char c : word.toCharArray()){

                if(!node.containsKey(c))
                    return false;

                node = node.get(c);

            }
            if(node.isEnd())
                return true;
            return false;

        }

        public boolean startsWith(String prefix) {

            Node node = root;
            for(char c : prefix.toCharArray()){

                if(!node.containsKey(c))
                    return false;

                node = node.get(c);

            }

            return true;
        }
    }

    class Node{

        Node[] arr = new Node[26];
        boolean flag ;

        public boolean containsKey(char c){
            return arr[c-'a']!=null;
        }

        public void put(char c, Node n){
            arr[c-'a'] = n;
        }

        public Node get(char c){
            return arr[c-'a'];
        }

        public void setEnd(){
            flag = true;
        }

        public boolean isEnd(){
            return flag;
        }

    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
