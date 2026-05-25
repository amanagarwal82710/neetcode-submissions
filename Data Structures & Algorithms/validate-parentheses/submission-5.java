class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
         if(s.length() == 1){
            return false;
         }
        char openRound = '(';
        char openCurly = '{';
        char openSquare = '[';
        
        char closeRound = ')';
        char closeSquare = ']';
        char closeCurly = '}';
        
        for(char ch: s.toCharArray()){
            if(ch == openRound || ch == openSquare || ch == openCurly){
                st.push(ch);
            }
            else if(ch == closeRound){
                if(st.isEmpty() || st.pop() != openRound){
                    return false;
                }
            }
            else if(ch == closeCurly){
                if(st.isEmpty() || st.pop() != openCurly){
                    return false;
                }
            }

            else if(ch == closeSquare){
                if(st.isEmpty() || st.pop() != openSquare){
                    return false;
                }
            }
            
        }
        return st.isEmpty();

    }
}
