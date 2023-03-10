class Solution {
    public int searchInsert(int[] Arr, int k) {
        int low=0;
        int high=Arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Arr[mid]==k)
                return mid;
            else if(Arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
