class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int low=0;
        int high=arr.length-1;
        if(arr[low]<=arr[high])
            return 0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[0]>arr[mid]){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
}
