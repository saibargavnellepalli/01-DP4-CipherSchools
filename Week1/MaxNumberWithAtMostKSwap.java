package Week1;

public class MaxNumberWithAtMostKSwap {
    static String max = "-1";
    public static void main(String[] args) {
        String s = "129814999";
      backTrack(0,s.toCharArray(),4);
        System.out.println(max);
    }

    public static void backTrack(int ind, char s[], int k){
        if(ind==s.length){
            return;
        }

        if (k<=0) return;

        char maxc = s[ind];
        for (int i=ind+1;i<s.length;i++){
            if (maxc < s[i])
                maxc = s[i];
        }

        if (maxc != s[ind]){
            k-=1;
        }
        for (int i=ind;i<s.length;i++){

                swap(s,ind,i);

                int curVal = Integer.valueOf(String.valueOf(s));
                int maxVal = Integer.valueOf(max);
                maxVal = Math.max(maxVal,curVal);
                max = Integer.toString(maxVal);
                backTrack(ind+1,s,k);
                swap(s,ind,i);

        }
    }

    private static void swap(char[] s, int ind, int i) {
        char t = s[ind];
        s[ind] = s[i];
        s[i] = t;
    }
}
