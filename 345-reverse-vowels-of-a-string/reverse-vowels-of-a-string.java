class Solution 
{
    public String reverseVowels(String s)
     {
        int n=s.length();
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
     
        while(start<end)
        {
            if(!vowel(ch[start]))
            { 
                start++;
            }
            else if(!vowel(ch[end]))
            { 
                end--;
            }
            else
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
      }
         public static boolean vowel(char ch)
         {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||       ch=='O'||ch=='U')
            {
                return true;
            }else{
                return false;
            }
        }
}