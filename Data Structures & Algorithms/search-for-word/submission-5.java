class Solution {
    public static boolean searchWord(String word,char[][] board,int i,int j,int wordIndex,HashSet<String>myset){
        if(myset.contains(i+","+j)){
            return false;
        }
        
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || word.charAt(wordIndex)!=board[i][j]){
            return false;
        }
        if(word.charAt(wordIndex)==board[i][j]){
            wordIndex+=1;
            if(wordIndex>=word.length()){
                return true;
            }
        }
        myset.add(i+","+j);

                boolean found = searchWord(word, board, i, j+1,wordIndex,myset) ||
                searchWord(word, board, i, j-1,wordIndex,myset)||
                searchWord(word, board, i-1, j,wordIndex,myset)||
                searchWord(word, board, i+1, j,wordIndex,myset);
                myset.remove(i+","+j);
                return found;
                
    }
    public boolean exist(char[][] board, String word) {
            for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               if(word.charAt(0)==board[i][j]){
                if(searchWord(word, board, i, j,0,new HashSet<>())){
                    return true;
                }
               }
            }
        }
        return false;
    }
}
