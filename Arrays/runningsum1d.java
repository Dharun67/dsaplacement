class runningsum1d {
    public int[] runningSum(int[] nums) {
      for (int i =1;i<nums.length;i++)
      {
        nums[i] = nums[i] + nums[i-1];

      }  

      return nums ;

    }


    public static void main(String[] args) {
        runningsum1d obj = new runningsum1d();
        int[] nums = {1,2,3,4};
        int[] result = obj.runningSum(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}       