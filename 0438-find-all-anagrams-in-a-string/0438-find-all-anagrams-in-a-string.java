class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list =new ArrayList<>();

        int k=p.length();
        int n=s.length();

        int[] freq1=new int[128];
        int[] freq2=new int[128];

        for(int i=0;i<p.length();i++)
        {
            char c1=p.charAt(i);
            freq1[c1]++;
        }
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            char c2=s.charAt(j);
            freq2[c2]++;

            if(j-i+1>k)
            {
                char c3=s.charAt(i);
                freq2[c3]--;
                i++;
            }
            if(j-i+1==k)
            {
                if(Arrays.equals(freq1,freq2))
                {
                    list.add(i);
                }
            }
        }
        return list;
    }
}