class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i=0;
        double max=Integer.MIN_VALUE;
        double sum=0;

        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j];

            if(j-i+1>k)
            {
                sum-=arr[i];
                i++;
            }
            if(j-i+1==k)
            {
                max=Math.max(max,sum);
            }
        }
        return max/k;
    }
}