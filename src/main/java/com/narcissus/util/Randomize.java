package com.narcissus.util;

import java.util.Random;


public class Randomize {

	public static void numbers()
	{
		Random random=new Random();
	int num=random.nextInt(6);
	System.out.println(num);
	}
	public static void main(String[] args) {
		numbers();
	}
}
