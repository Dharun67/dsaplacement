// 1 st method brite force
class Solution {
    public int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}

// 2 nd method using cycle detection    
// slow and fast pointer


class Solution {
    public int findDuplicate(int[] nums) {
         int tortoise = nums[0];
         int hare = nums[0];

         do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
         }while(tortoise!=hare);

         hare = nums[0];
         while(tortoise!=hare)
         {
            tortoise = nums[tortoise];
            hare = nums[hare];
         }
         return tortoise;  
    }
}