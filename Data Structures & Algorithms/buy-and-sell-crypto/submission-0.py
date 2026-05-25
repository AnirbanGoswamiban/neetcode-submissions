class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        cp=prices[0]
        i=0
        profit=0
        while i < len(prices):
            curSp=prices[i]
            curCp=prices[i]
            curProfit=curSp-cp
            if curProfit > profit:
                profit=curProfit
            if cp > curCp:
                cp=curCp
            i+=1
        return profit
            
            

        