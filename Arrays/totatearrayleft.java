import java.util.*;
class rotatearrayleft
{

    public void rotatearrayleft(int []nums, int k)
    {
         k =k%nums.length ;

         for(int i =0;i<k;i++)
         {
int temp = nums[0];
    for(int j =0;j<nums.length;j++)
    {
          nums[j-1]=nums[j];
    }
 nums[nums.length] = temp ;

         }
    }
}

