package com.bnova.techhub;

public class Varia
{
	public static void main(String[] args)
	{
		System.out.println("Hello Varia!");


		var i = Math.clamp(2, 1, 3);
		System.out.println(i);

		i = Math.clamp(5, 1, 3);
		System.out.println(i);

		i = Math.clamp(6, 10, 100);
		System.out.println(i);
	}

}
