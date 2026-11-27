class Solution {
    public int removeDuplicates(int[] arr) {

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            arr[i]=arr[j];

            while(j+1<arr.length&&arr[j]==arr[j+1])
            {
                j++;
            }
            i++;
        }
        return i;
    }
}