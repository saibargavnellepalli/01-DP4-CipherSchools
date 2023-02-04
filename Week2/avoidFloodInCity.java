package Week2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class avoidFloodInCity {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        avoidFlood(arr);
    }
 public static int[] avoidFlood(int[] rains) {
        int[] result = new int[rains.length];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(); // zero lake index
        Arrays.fill(result, -1);
        for (int index = 0; index < rains.length; index++) {
            if (rains[index] > 0) {
                if (map.containsKey(rains[index]) && list.isEmpty()) {
                    return new int[0];
                } else if (!map.containsKey(rains[index])) {
                    map.put(rains[index], index);
                } else if (map.containsKey(rains[index]) && !list.isEmpty()) {
                    int zeroIndex = findClosestZero(list, map.get(rains[index]), result);
                    if (zeroIndex == -1) {
                        return new int[0];
                    } else {
                        result[list.get(zeroIndex)] = rains[index];
                        map.put(rains[index], index);
                    }
                }
            } else {
                list.add(index);
            }
        }
        for (int index = 0; index < list.size(); index++) {
            if (result[list.get(index)] == -1) {
                result[list.get(index)] = 1;
            }
        }
        return result;
    }

    public static int findClosestZero(List<Integer> list, int index, int[] result) {
        int left = 0;
        int right = list.size() - 1;
        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
                                        //if the closet zero has already been used
            if (list.get(mid) < index || result[list.get(mid)] != -1) {
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}
