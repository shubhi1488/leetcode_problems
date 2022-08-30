/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

Example 2:

Input: coins = [2], amount = 3
Output: -1

Example 3:

Input: coins = [1], amount = 0
Output: 0

 

Constraints:

    1 <= coins.length <= 12
    1 <= coins[i] <= 231 - 1
    0 <= amount <= 104


*/
#code
class Solution {
    public int coinChange(int[] coins, int amount)
    {
        int max=amount+1;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,max);//we fill the value in the array with maximum value.
        dp[0]=0;//first amount of the array which is the base condition
       // i is the amount which is the index of the array
        for(int i=1;i<=amount;i++){
            //for making coins
            for(int j=0;j<coins.length;j++){
                //if the coin is smaller than the amount
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];//if thr last value is large than the given amount then we cannot make the amount with the use of these coins.
    }
}
