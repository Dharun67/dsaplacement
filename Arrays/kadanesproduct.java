class kadanesproduct 
{
    public kadanesproduct(String[]args)
    {

        int p =1;
        int s=1;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++)
        {
            p = p*nums[i];
            max= Math.max(max,p);  
            if(p==0)
            {
                p=1;
            }
        
            
              }
            for(int i=nums.length-1;i>=0;i--)
            {
                s=s*nums[i];
                max=Math.max(max,s);
                if(s==0){
                    s=1;

                }
            }

            return max;
    }
}