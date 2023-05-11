import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []nums, int k) {
        // Write your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int xor=0;
        int cnt=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            int r=xor^k;
            cnt+=hm.getOrDefault(r,0);
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
}
