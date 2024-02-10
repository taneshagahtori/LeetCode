class Solution {
    public int countSubstrings(String s) {
        int count=0;
         if(s.length()<=1)
        {
            return 1;
        }
            for(int i=0;i<s.length();i++)
            {
                int begin=i,end=i;
                while(begin>=0&&end<s.length())
                {
                if(s.charAt(begin)==s.charAt(end))
                {
                    begin--;
                    end++;
                    count++;
                }
                else
                {
                    break;
                }
            }
            }
            for(int i=0;i<s.length();i++)
            {
                int begin=i,end=i+1;
                while(begin>=0&&end<s.length())
                {
                if(s.charAt(begin)==s.charAt(end))
                {
                    begin--;
                    end++;
                    count++;
                }
                else
                {
                    break;
                }
            }
            }
        return count;
    }
}