func maxProfit(prices []int) int {

    maxp :=-1
    minp :=prices[0]

    for _,v:=range prices {
        minp = min(minp, v)
        profit := v-minp
        maxp = max(maxp, profit)
    }
    return maxp
    
}