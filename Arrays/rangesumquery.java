class rangesumquery {
    
    int prefix[] ;
    public rangesumquery(int[] nums) {
         prefix = new int[nums.length+1];

         for(int i =0;i<nums.length;i++)
         {
            prefix[i+1]=prefix[i]+nums[i];
         }
    }
    
    public int sumRange(int left, int right) {
        
        return prefix[right+1] - prefix[left];
    }

        public static void main(String[] args) {
        rangesumquery obj = new rangesumquery(new int[]{1,2,3,4});
        int[] result = obj.sumRange(1,3);
        System.out.println("Result: " + Arrays.toString(result));
    }

}   