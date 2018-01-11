package com.leetcode;

public class ReverseInteger {
	public static void main(String[] args) {
		int a = 1123456789;
		System.out.println(reverse(a));
	}
	
	public static int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
	
//	public static int reverse(int x) {
//		int reverseNum = 0;
//		while(x!=0){
//			reverseNum = reverseNum * 10 + x % 10;
//			x = x / 10;
//			if(reverseNum * 10 > Integer.MAX_VALUE || reverseNum<Integer.MIN_VALUE){
//				return 0;
//			}
//		}
//		
//		return reverseNum;
//	}
}
