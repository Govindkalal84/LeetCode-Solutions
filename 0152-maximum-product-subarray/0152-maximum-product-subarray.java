class Solution {
    public int maxProduct(int[] arr) {



        int pr=arr[0];
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]<0)
            {
                int temp=pr;
                pr=min;
                min=temp;
            }
            pr=Math.max(arr[i],arr[i]*pr);
           min=Math.min(arr[i],arr[i]*min);
           max=Math.max(max,pr);

        }
        return max;
    }
}