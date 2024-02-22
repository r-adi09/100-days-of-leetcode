class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == ""){
            return 0;
        }
        int[] lps = new int[needle.length()];
        int prevlps = 0;
        int i=1;
        //construct lps table
        while(i<needle.length()){
            if(needle.charAt(i) == needle.charAt(prevlps)){
                lps[i] = prevlps + 1;
                prevlps++;
                i++;
            }
            else if(prevlps == 0){
                lps[i]=0;
                i++;
            }
            else{
                prevlps = lps[prevlps-1];
            }
        }

        i=0;
        int j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
            if(j==needle.length()){
                return i-needle.length();
            }
        }
        return -1;
    }
}