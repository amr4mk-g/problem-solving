class Solution {
    public int majorityElement(int[] nums) {
        int[] d=new int[nums.length];
        int e=1, v=nums[0];
        for(int i=0; i<nums.length-1; i++){
            int y=0;
             for(int j=i; j<nums.length; j++){
               if(nums[i]==nums[j]){y++;}  
             }
            if(y>e){e=y; v=nums[i];}
        }
        return v;
    }
}