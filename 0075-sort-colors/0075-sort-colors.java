class Solution {
    public void sortColors(int[] arr) {

        int i=0;
        int mid=0;
        int j=arr.length-1;

        while(mid<=j)
        {
            if(arr[mid]==0)
            {
                swap(arr,i,mid);
                mid++;
                i++;
            }
            else if(arr[mid]==1)
            {
                 mid++;
            }
            else
            {
                swap(arr,mid,j);
                j--;
            }
        }
        
    }

    static void swap(int[] arr,int i,int j)
    {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}