package Trie;

public class ImplementTrie2 {

//    https://www.codingninjas.com/codestudio/problems/implement-trie_
//    1387095?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
    public class Trie {
        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node node = root;
            for(char c : word.toCharArray()){
                if(!node.containsKey(c)){
                    node.put(c, new Node());
                }
                node = node.get(c);
                node.increaseCountWith();
            }
            node.increaseEndsWith();
        }

        public int countWordsEqualTo(String word) {
            Node node = root;
            for(char c : word.toCharArray()){
                if(!node.containsKey(c)){
                    return 0;
                }
                node = node.get(c);
            }
            return node.ew;
        }

        public int countWordsStartingWith(String word) {
            Node node = root;
            for(char c : word.toCharArray()){
                if(!node.containsKey(c)){
                    return 0;
                }
                node = node.get(c);
            }
            return node.cp;
        }

        public void erase(String word) {

            Node node = root;
            for(char c : word.toCharArray()){
                if(node.containsKey(c)){
                    node = node.get(c);
                    node.cp -=1;
                }

            }
            node.ew -=1;
        }
    }

    class Node{

        Node[] arr = new Node[26];
        int ew;
        int cp;

        boolean containsKey(char c){
            return arr[c-'a']!=null;
        }

        Node get(char c){
            return arr[c-'a'];

        }

        void put(char c, Node n){
            arr[c-'a'] = n;
        }
        void increaseCountWith(){
            cp++;
        }

        void increaseEndsWith(){
            ew++;
        }

    }

}
