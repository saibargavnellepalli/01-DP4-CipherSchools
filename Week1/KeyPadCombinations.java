package Week1;

import java.util.*;

public class KeyPadCombinations {


    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> ansList = new ArrayList<>();
        String[] store = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0) return ansList;
        allCombinations(0,"",ansList,store,digits,digits.length());


        return ansList;
    }

    public static void allCombinations(int i, String curAns, List<String> ansList, String store[], String s, int n){

        if(i==n){

            ansList.add(curAns);
            return;
        }
        // System.out.println(curAns);
        for(int j=0;j<store[s.charAt(i)-'0'].length();j++){

            allCombinations(i+1,curAns+store[s.charAt(i)-'0'].charAt(j), ansList, store, s, n);
        }

        return;
    }
}
