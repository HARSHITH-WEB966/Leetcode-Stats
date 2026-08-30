class Solution {
    public String minWindow(String s, String t) {

        int minSize=Integer.MAX_VALUE;
        int index=-1;

        int hash[]=new int[256];

        for(char ch: t.toCharArray()){
            hash[ch]++;
        }
        int c=0,l=0,r=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]>0) c++;
            hash[s.charAt(r)]--;

            while(c==t.length()){
                if(r-l+1<minSize){
                    minSize=r-l+1;
                    index=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) c--;
                l++;
            }
            r++;
        }
        if(index==-1) return "";
        return s.substring(index,index+minSize);
        // for(int i=0;i<s.length();i++){
        //     int hash[]=new int[256];
        //     for(char ch:t.toCharArray()){
        //         hash[ch]++;
        //     }
        //     int c=0;
        //     for(int j=i;j<s.length();j++){
        //         if(hash[s.charAt(j)]>0) c++;

        //         hash[s.charAt(j)]--;

        //         if(c==t.length()){
        //             if(j-i+1<minSize){
        //                 minSize=j-i+1;
        //                 index=i;
        //             } break;
        //         }
        //     }
        // }
        // if(index==-1) return "";
        // return s.substring(index,index+minSize);
    }
}