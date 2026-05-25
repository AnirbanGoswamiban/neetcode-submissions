class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String i : tokens){
            int a;
            int b;
            int num;
            switch(i){
                case("+"):
                 a=st.pop();
                 b=st.pop();
                st.push(a+b);
                break;
                case("-"):
                 a = st.pop();
                 b = st.pop();
                 num = b-a;
                st.push(num);
                break;
                case("*"):
                 a = st.pop();
                 b = st.pop();
                 num = a*b;
                 st.push(num);
                 break;
                case("/"):
                 a = st.pop();
                 b = st.pop();
                 num = b/a;
                st.push(num);
                break;
                default:
                st.push(Integer.parseInt(i));
                break;
            }
        }
        return st.pop();
    }
}
