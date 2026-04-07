class Solution {
    public int maxProduct(int[] nums) {
        int curr=nums[0];
        int currmin=nums[0];
        int currmax=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=Math.max(nums[i],Math.max(nums[i]*currmax,nums[i]*currmin));
            currmin = Math.min(nums[i],Math.min(nums[i]*currmax,nums[i]*currmin));

            currmax=temp;
            res=Math.max(res,currmax);   
        }
        return res;

    }
}
