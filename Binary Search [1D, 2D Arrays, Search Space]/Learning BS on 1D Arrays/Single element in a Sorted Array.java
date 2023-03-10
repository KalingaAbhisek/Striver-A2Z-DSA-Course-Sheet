class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int cnt=mid+1;
            if((cnt&1)==0){
                if(mid>0 && nums[mid]==nums[mid-1])
                    low=mid+1;
                else if(mid<nums.length-1 && nums[mid]==nums[mid+1])
                    high=mid-1;
                else
                    return nums[mid];
            }
            if((cnt&1)==1){
                if(mid>0 && nums[mid]==nums[mid-1])
                    high=mid-1;
                else if(mid<nums.length-1 && nums[mid]==nums[mid+1])
                    low=mid+1;
                else
                    return nums[mid];
            }
        }
        return -1;
    }
}
