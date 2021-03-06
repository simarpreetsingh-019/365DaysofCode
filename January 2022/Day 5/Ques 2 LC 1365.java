//Leetcode 1365 How many no are Smaller Than current number
// Language : Java
// Time : 1 ms
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] temp = new int[101];
        
        //frequency sorting
        for(int i = 0; i< nums.length; i++)
        {
            temp[nums[i]]++;
        }
        
        //running sum
        for(int i = 1; i< 101; i++)
        {
            temp[i] += temp[i-1];
        }
        
        //storing ans
        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] == 0)
            {
                res[i] = 0;
            }
            else
            {
                res[i] = temp[nums[i] -1];
            }
        }
        return res;
    }
    
}