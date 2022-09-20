package com.blz.java;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake & Ladder Computation Program!!");
		int position = 0;
		int player = 1;
		int count = 0;
		System.out.println("Start Position=" + position);
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		System.out.println("Single player at start position is " + dice);
		System.out.println("Dice outcome is =" + dice);

		count++;

		System.out.println("Total count " + count);

	}

}
