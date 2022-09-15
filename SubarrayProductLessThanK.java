/*
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k
*/
#code-
  class Solution{
  public int numSubarrayProductLessthanK(int [] nums,int k){
  int count=0;
  int left=0;
  int prod=1;
  for(int i=0;i<nums.length;i++){
    prod*=nums[i];
    while(prod>=k){
      prod/=nums[left++];
    }
    count+=i-left+1;
  }
  return count;
}
  }
