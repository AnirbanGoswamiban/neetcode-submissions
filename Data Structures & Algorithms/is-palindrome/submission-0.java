class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char curChar=s.charAt(i);
            if(Character.isLetterOrDigit(curChar)){
                sb.append(curChar);
            }
        }
        String original = sb.toString().toLowerCase();
        String reversed = sb.reverse().toString().toLowerCase();
        if(original.equalsIgnoreCase(reversed)){
            return true;
        }
        return false;
    }
}
