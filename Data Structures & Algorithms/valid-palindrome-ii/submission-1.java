class Solution {
        private boolean isPalindrome(String s, int n, int m) {
        while (n < m) {
            if (s.charAt(n) != s.charAt(m)) return false;
            n++;
            m--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=0;
        int m=s.length()-1;
        while(n<m){
            if(s.charAt(n)!=s.charAt(m)){
                return isPalindrome(s,n+1,m) || isPalindrome(s,n,m-1);
            }else{
            n+=1;
            m-=1;
            }
        }
        return true;
    }
}