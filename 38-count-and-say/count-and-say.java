class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        String prev=countAndSay(n-1);
        int len=prev.length(),c=1;

        String ans="";
        for(int i=1;i<len;i++){
            if(prev.charAt(i)==prev.charAt(i-1)) c++;
            else{
                ans+=(char)('0'+c);
                ans+=prev.charAt(i-1);
                c=1;
            }
        }
        ans+=(char)('0'+c);
        ans+=prev.charAt(len-1);

        return ans;
    }
}