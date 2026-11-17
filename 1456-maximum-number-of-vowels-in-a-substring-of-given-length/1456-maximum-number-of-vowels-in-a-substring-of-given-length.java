class Solution {
    public int maxVowels(String str, int k) {

        int i=0;
        int count=0;
        int max=0;
        for(int j=0;j<str.length();j++)
        {
            char c1=str.charAt(j);
            if(isvowel(c1))
            {
                count++;
            }
            if(j-i+1>k)
            {
                char c2=str.charAt(i);
                if(isvowel(c2))
                {
                    count--;
                }
                i++;
            }
            if(j-i+1==k)
            {
                max=Math.max(max,count);
            }

        }

        return max;
    }
    static boolean isvowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}