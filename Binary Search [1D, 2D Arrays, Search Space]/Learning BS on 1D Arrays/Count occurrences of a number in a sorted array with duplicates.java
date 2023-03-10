class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int leftind=leftbs(arr,x);
        int rightind=rightbs(arr,x);
        if(leftind==-1 || rightind==-1)
            return 0;
        return rightind-leftind+1;
    }
    public int leftbs(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
            }
            if(arr[mid]>=x){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public int rightbs(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
            }
            if(arr[mid]<=x){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
}
