package com.leetcode;

public class Palindrome {
	public static void main(String[] args) throws Exception {
		System.out.println(isPalindrome(4321));
	}
	
	 public static boolean isPalindrome(int x) throws Exception {
		 if(x < 0 || (x % 10 == 0 && x != 0)) {
	            return false;
	     }
		 
		 int revertedNumber = 0;
	        while(x > revertedNumber) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	     }
	        
	        return x == revertedNumber || x == revertedNumber/10;
	 }

	
//	 public static boolean isPalindrome(int x) throws Exception {
//		 if (x<0){
//			 return false;
//		 }
//		 
//		 int original = x;		 
//		 int tempResult = 0;
//		 int result = 0;
//		 
//		 while (x!=0){
//			 int tail = x % 10;
//			 tempResult = tempResult * 10 + tail;
//			 if((tempResult-tail)/10 != result){
//				 return false; //overflow
//			 }
//			 x = x /10;
//			 result = tempResult;
//		 }
//		 
//		 if(original == result){
//			 return true;
//		 }
//		
//		 return false;
//	 }
}
