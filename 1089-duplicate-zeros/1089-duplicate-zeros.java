class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n=arr.length;
         int[] temp=new int[n];

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
              if (i == n) {
                break;
            }
            if(arr[j]==0)
            {
                temp[i]=0;
                i++;
                if(i<n)
                {
                    temp[i]=0;
                    i++;
                }
            }
            else
            {
            temp[i]=arr[j];
            i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            arr[j]=temp[j];
        }
        
    }
}