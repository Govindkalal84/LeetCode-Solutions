class Solution {
    public int[] sortedSquares(int[] arr) {


        int i=0;
        int j=arr.length-1;


        while(i<=j)
        {
            arr[i]=arr[i]*arr[i];

            if(i!=j)
            {
                arr[j]=arr[j]*arr[j];
            }
            i++;
            j--;
        }
        Arrays.sort(arr);
        return arr;
    }
}