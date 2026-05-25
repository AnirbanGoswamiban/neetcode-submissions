class Solution {
    /**
     * @param {string} s
     * @return {string}
     */
    longestPalindrome(s) {
        let maxWord = ""
        for(let i=0;i<s.length;i++){
            let l = i
            let r = i
            while(l>=0 && r<s.length && s[l] === s[r]){
                let curword = s.slice(l,r+1)
                if(curword.length > maxWord.length){
                    maxWord = curword
                }
                l-=1
                r+=1
            }
            l = i
            r = i+1
            while(l>=0 && r<s.length && s[l] === s[r]){
                let curword = s.slice(l,r+1)
                if(curword.length > maxWord.length){
                    maxWord = curword
                }
                l-=1
                r+=1
            }
        }
        return maxWord
    }
}
