class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        for(int num :nums){
            total+=num;

        }
        int leftsum =0;
        for(int i =0;i<nums.length;i++)
        {
             int right =  total - nums[i]- leftsum;
             if(leftsum == right)
             {
                return i;
             }

             leftsum+=nums[i];
        }

        return -1;
    }
}


// comes under the prefix sums and also basic array concep , i solved using prefix sum , i has better time complextiy