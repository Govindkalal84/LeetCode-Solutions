class Solution {
    public int maxAbsoluteSum(int[] arr) {

        int max=arr[0];
        int maxkad=arr[0];

        int min=arr[0];
        int minkad=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(arr[i],min+arr[i]);
            minkad=Math.min(minkad,min);

            max=Math.max(arr[i],max+arr[i]);

            maxkad=Math.max(maxkad,max);
        }
        return Math.max(maxkad,Math.abs(minkad));
    }
}