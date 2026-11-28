class Solution {
    public int compress(char[] arr) {


        int n=arr.length;
        StringBuilder stb=new StringBuilder();

        for(int j=0;j<arr.length;)
        {
        int count=0;
              char ch=arr[j];

              while(j<n&&arr[j]==ch)
              {
                count++;
                j++;
              }
              stb.append(ch);
              if(count>1)
              {
                stb.append(count);
              }
        }
              for(int k=0;k<stb.length();k++)
              {
                arr[k]=stb.charAt(k);
              }
        
          return stb.length();
    }
}