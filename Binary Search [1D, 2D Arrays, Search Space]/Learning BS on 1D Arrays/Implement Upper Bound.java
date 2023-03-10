class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        Pair p=new Pair();
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else
                high=mid-1;
        }
        p.floor=ans;
        ans=-1;
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else
                low=mid+1;
        }
        p.ceil=ans;
        return p;
    }
}
