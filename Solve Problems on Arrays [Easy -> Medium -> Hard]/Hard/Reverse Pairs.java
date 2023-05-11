public class Solution {
    public static int team(int []arr, int N){
        // Write your code here.
        int temp[]=new int[N];
        int cnt=merge_Sort(arr,temp,0,(int)(N-1));
        return cnt;
    }
private static void merge(int[] arr,int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }
    
        while(i <= mid - 1)
            temp[k++] = arr[i++];
    
        while(j <= right)
            temp[k++] = arr[j++];
    
        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];
    }
    public static int count_pairs(int[] arr,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2*arr[right]) right++;
            count+=(right-(mid+1));
        }
        return count;
    }
    public static int merge_Sort(int[] arr,int[] temp, int left, int right) {
        int mid;
        int count = 0;
        if(right > left)
        {
            mid = (left + right)/2;
            count += merge_Sort(arr,temp,left,mid);
            count += merge_Sort(arr,temp,mid+1,right);
            count+=count_pairs(arr,left,mid,right);
            merge(arr,temp,left,mid+1,right);
        }
        return count;
    }  
    
}
