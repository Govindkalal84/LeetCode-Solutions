class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n=arr.length;

        int total=0;
        int max=0;
        int maxkad=arr[0];

        int min=0;
        int minkad=arr[0];


        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
            max=Math.max(arr[i],max+arr[i]);
            maxkad=Math.max(maxkad,max);

            min=Math.min(arr[i],min+arr[i]);
            minkad=Math.min(minkad,min);
        }
        if(maxkad<0)
        {
         return maxkad;
        }
        return Math.max(maxkad,total-minkad);
    }
}