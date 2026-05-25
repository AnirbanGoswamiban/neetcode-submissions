class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        let prefix=strs[0]
        let maxSize=0
        for(let str of strs){
            while(!str.startsWith(prefix)){
                prefix=prefix.slice(0,prefix.length-1)
                maxSize=Math.max(maxSize,prefix.length)
            }
        }
        return prefix
    }
}
