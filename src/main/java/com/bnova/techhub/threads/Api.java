package com.bnova.techhub.threads;

public class Api
{
	public static void callApi()
	{
		try {
			Thread.sleep(1000); // Simulate work by sleeping for 1 second
			System.out.println("Running in virtual thread");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println(STR."Thread interrupted: \{e.getMessage()}");
		}
	}
}
