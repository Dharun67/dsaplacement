class Solution {
    public int maxSubArray(int[] nums) {
        

        int curr =0 ;
        int  max = Integer.MIN_VALUE;
        for (int i =0;i< nums.length;i++)
        {
            int temp = curr + nums[i];

            if(temp<nums[i])
            {
                curr = nums[i];

            }
            else{
                curr = temp ;

            }

            if(max<curr)
            {
                max = curr;
            }
        }
        return curr; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = sol.maxSubArray(nums);
        System.out.println("Result: " + result);
    }
}   