package Week1;

import java.util.Arrays;

public class MinimumNoOFPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int max, plat,i=0,j=0;
        max=0;
        plat=0;

        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                plat++;
                i++;
            }
            else if(arr[i] >= dep[j]){

                plat--;
                j++;
            }
            max=Math.max(max,plat);
        }

        return max;

    }
}
