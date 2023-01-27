package Week1.Stackss;
import java.util.*;

public class redundantBrackets {
    static boolean redundant(String s){
        Stack<Character> st = new Stack<>();

        char[] str = s.toCharArray();

        for(char ch : str){
            if(ch == ')'){
                char top = st.peek();
                st.pop();

                boolean flag = true;

                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        flag = false;
                    }

                    top = st.peek();
                    st.pop();
                }

                if(flag == true){
                    return true;
                }
            }

            else{
                st.push(ch);
            }
        }
        return false;
    }



    public static void main(String[] args){

        String str = "((a+b))";
        boolean a = redundant(str);
        System.out.println(a);

    }

}
