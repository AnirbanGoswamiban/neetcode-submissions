class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    permute(nums) {
        let res = []
        function backtrack(up,p){
            if(up.length === 0){
                res.push([...p])
                return
            }
            for(let i=0;i<up.length;i++){
                let num = up[i]
                backtrack([...up.slice(0,i),...up.slice(i+1,up.length)],[...p,num])
            }
        }
        backtrack(nums,[])
        return res
    }
}
