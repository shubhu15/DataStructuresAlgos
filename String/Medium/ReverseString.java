package String.Medium;

public class ReverseString {

//    https://leetcode.com/problems/reverse-words-in-a-string/
//    NEED TO CHECK FOR BETTER SOLUTION
    public String reverseWords(String s) {
        String[] rev = s.split(" ");

        StringBuffer str = new StringBuffer();

        for(int i =rev.length-1 ; i>=0; i--){
            if(!rev[i].trim().isEmpty())
            {str.append(rev[i].trim());
                str.append(" ");}
        }

        return str.toString().trim();
    }
}
