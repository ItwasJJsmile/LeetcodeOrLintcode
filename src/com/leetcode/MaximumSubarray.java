package com.leetcode;

/**
 * Leetcode.53
 * @author bsnpc1c
 * [4,-1,2,1] has the largest sum = 6. 
 */
public class MaximumSubarray {
	public static void main(String[] args) {
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
//		int a[] = {2,-1,3};
		System.out.println(maxSubArray(a));
//		System.out.println(maxSubArraySum(a));
	}
	
	public static int maxSubArray(int[] nums){
		 int maxSoFar=nums[0], pre=nums[0];
		    for (int i=1;i<nums.length;i++){
		    	pre= Math.max(pre+nums[i],nums[i]);
		    	maxSoFar=Math.max(maxSoFar, pre);	
		    }
		    return maxSoFar;
	}
	
	public static int maxSubArraySum(int a[]){
	        int size = a.length;
	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	 
	        for (int i = 0; i < size; i++)
	        {
	            max_ending_here = max_ending_here + a[i];
	            if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	            if (max_ending_here < 0)
	                max_ending_here = 0;
	        }
	        return max_so_far;
	    }
}
