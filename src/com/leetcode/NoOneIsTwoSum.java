package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NoOneIsTwoSum {
	
//	1. Two Sun
//	Given nums = [2, 7, 11, 15], target = 9,
//
//	Because nums[0] + nums[1] = 2 + 7 = 9,
//	return [0, 1].

	public static void main(String[] args) {
		
		int[] nums = {11, 7, 15, 2};
		int target = 9;
		int[] result = twoSum(nums, target);
			if(result!=null){
				for(int i : result){
					System.out.println("result....: " + i);
			}			
		}		
	}
	
	 public static int[] twoSum(int[] nums, int target){
		 Map<Integer,Integer> m = new HashMap<>();  // Integer 
		 for(int i=0;i<nums.length;i++){
			 int complement = target - nums[i];   // memory 
			 if(m.containsKey(complement)){
				return new int[] {m.get(complement),i};
			 }
			 m.put(nums[i], i);
		 }
		 
		 throw new IllegalArgumentException("No two sum solution");

		 

//		 Map<Integer, Integer> map = new HashMap<>(); // -- 1.poly???
//		    for (int i = 0; i < nums.length; i++) {
//		        int complement = target - nums[i];   //-- 2.int integer memory.
//		        if (map.containsKey(complement)) {
//		            return new int[] { map.get(complement), i };
//		        }
//		        map.put(nums[i], i);
//		    }
//		    throw new IllegalArgumentException("No two sum solution");
    }   
}
