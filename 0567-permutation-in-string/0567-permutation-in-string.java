class Solution {
    public boolean checkInclusion(String s1, String s2) {


    int n=s1.length();

    int k=s2.length();


    if(n>k)
    {
        return false;
    }    

    int[] freq1=new int[26];

    int[] freq2=new int[26];

    for(int i=0;i<n;i++)
    {
        char c1=s1.charAt(i);

        freq1[c1-'a']++;
    }    
      int i=0;

      for(int j=0;j<k;j++)
      {
        char c2=s2.charAt(j);
          freq2[c2-'a']++;


          if(j-i+1>n)
          {
            char c3=s2.charAt(i);
            freq2[c3-'a']--;
            i++;
          }
          if(j-i+1==n)
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