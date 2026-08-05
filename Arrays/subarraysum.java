class subarraysum {
    public int subarraysum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int count =0;

        for (int num:nums)
        {

            sum+=num;

          if(sum==k)
          {
            count++;
          }
          if(map.containsKey(sum-k)==true)
          {
            count+=map.get(sum-k);
          }
          if(map.containsKey(sum)==false)
          {
            map.put(sum,1);
          }
          else
          {
            map.put(sum,map.get(sum)+1);
          }
          
        }
        return count;
    }

    public static void main(String[] args) {
        subarraysum obj = new subarraysum();
        int[] nums = {1,2,3,4};
        int[] result = obj.subarraySum(nums,3);
        System.out.println("Result: " + Arrays.toString(result));
    }

}   