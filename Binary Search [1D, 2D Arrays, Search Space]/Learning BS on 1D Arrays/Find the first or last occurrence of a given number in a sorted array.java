class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int k=0;
        arr[k++]=leftbs(nums,target);
        arr[k++]=rightbs(nums,target);
        return arr;
    }
    public int leftbs(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                index=mid;
            if(nums[mid]>=target)
                high=mid-1;
            else
                low=mid+1;
        }
        return index;
    }
    public int rightbs(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                index=mid;
            if(nums[mid]<=target)
                low=mid+1;
            else
                high=mid-1;
        }
        return index;
    }
}
