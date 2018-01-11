package com.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.ReverseInteger;

public class ReverseIntegerTest {

	@Test
	public void testZeroAndOne(){
		//2147483647		
		assertEquals(1123456789,ReverseInteger.reverse(1123456789));
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}
