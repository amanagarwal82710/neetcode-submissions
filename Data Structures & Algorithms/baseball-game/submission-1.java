class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();
        int sum =0;
        for(int i=0; i<operations.length; i++){
           if(!Objects.equals(operations[i], "+") && !Objects.equals(operations[i], "C") && !Objects.equals(operations[i], "D")){
               st.push(operations[i]);
           } else if (Objects.equals(operations[i], "+") && st.size() >= 2) {
               int x= Integer.parseInt(st.pop());
               int y= Integer.parseInt(st.pop());
               st.push(String.valueOf(y));
               st.push(String.valueOf(x));
               st.push(String.valueOf(x+y));
           }
           else if(Objects.equals(operations[i], "C") && !st.isEmpty()){
               st.pop();
           }
           else if(Objects.equals(operations[i], "D") && !st.isEmpty()){
               int Z = Integer.parseInt(st.peek());
               Z = 2*Z;

               st.push(String.valueOf(Z));
           }
        }

       while (!st.isEmpty()){
           sum += Integer.parseInt(st.pop());
       }
       return sum;
    }
}