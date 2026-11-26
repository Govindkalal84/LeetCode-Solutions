class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freq1=new int[128];
        int[] freq2=new int[128];

        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            freq1[c1]++;
        }
         for(int j=0;j<t.length();j++)
         {
            char c2=t.charAt(j);

            freq2[c2]++;
         }
         for(int i=0;i<128;i++)
         {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
         }

        return true;
    }
}