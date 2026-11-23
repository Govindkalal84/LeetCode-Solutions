class Solution {
    public int lengthOfLongestSubstring(String str) {

        int i=0;
         int max=0;
        int[] freq=new int[128];

        for(int j=0;j<str.length();j++)
        {
            char c1=str.charAt(j);
               freq[c1]++;

            while(freq[c1]>1)
            {
                char c2=str.charAt(i);
                
                freq[c2]--;
                i++;
            }
          max= Math.max(max,j-i+1);
        }
        return max;
    }
}