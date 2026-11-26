class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n=arr.length;
      List<List<Integer>> list = new ArrayList<>();
      Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]>0)
            {
                break;
            }
            if(i>0&&arr[i]==arr[i-1])
            {
                 continue;
            }
        
        int l=i+1;
        int j=n-1;

    while(l<j)
    {
        int sum=arr[i]+arr[l]+arr[j];

        if(sum==0)
        {
            list.add(Arrays.asList(arr[i],arr[l],arr[j]));
        
        while(l<j&&arr[l]==arr[l+1])
        {
            l++;
        }
        while(l<j&&arr[j]==arr[j-1])
        {
            j--;
        }
        l++;
        j--;
        }
        else if(sum>0)
        {
            j--;
        }
        else
        {
            l++;
        }
    }
    }
    return list;
    }
}