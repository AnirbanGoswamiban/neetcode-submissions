class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p=0;
        int q=0;
        String res="";
        while(p<word1.length()&&q<word2.length()){
            res+=word1.charAt(p);
            res+=word2.charAt(q);
            p+=1;
            q+=1;
        }
        while(p<word1.length()){
            res+=word1.charAt(p);
            p+=1;
        }
        while(q<word2.length()){
            res+=word2.charAt(q);
            q+=1;
        }
        return res;
    }
}