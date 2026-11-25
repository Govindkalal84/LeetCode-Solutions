class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k=s1.length();
        int n=s2.length();

        int[] freq1=new int[128];
        int[] freq2=new int[128];
        if(k>n)
        {
            return false;
        }

        
        for(int j=0;j<k;j++)
        {
          char ch=s1.charAt(j);
          freq1[ch]++;
        }
        int i=0;
          for(int j=0;j<n;j++)
          {
            char c1=s2.charAt(j);
             freq2[c1]++;

             if(j-i+1>k)
             {
                char c2=s2.charAt(i);
                freq2[c2]--;
                i++;
             }
             if(j-i+1==k)
             {
                if(Arrays.equals(freq1,freq2))
                {
                    return true;
                }
             }
          }
        return false;
    }
}