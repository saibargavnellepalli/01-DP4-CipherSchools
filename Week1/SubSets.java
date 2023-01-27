package Week1;

import java.util.*;

public class SubSets {
    static Set<List<Integer>> ans = new HashSet<>();
    public static void main(String[] args) {
        int[] num = {3,2,67};
        subsets(num);
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<Integer> list = new ArrayList<>();

        combinations(0,0,nums,list);
        return new ArrayList<>(ans);
    }

    public static void combinations(int i, int sum, int[] arr, List<Integer> list){

        //System.out.println(sum);

        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }


        list.add(arr[i]);

        combinations(i+1,sum,arr,list);

        int n = list.size();

        list.remove(n-1);

        combinations(i+1,sum,arr,list);
    }
}

