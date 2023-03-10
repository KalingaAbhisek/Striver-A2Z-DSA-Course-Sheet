class Solution {
    public boolean search(int[] nums, int target) {
        if(x(nums,target)!=-1)
            return true;
        return false;
    }
    public int x(int[] A,int target){
        int low=0;
        int high=A.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==target)
                return mid;
            if(A[low]==A[mid] && A[mid]==A[high]){
                low++;
                high--;
            }
            else if(A[mid]<=A[high]){
                if(target>=A[mid] && target<=A[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
            else if(A[low]<=A[mid]){
                if(target>=A[low] && target<=A[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
}
