package com.ambcool;

import java.util.Arrays;

import com.ambcool.impl.MovingAverageQueue;

public class Application {
	public static void main(String[] args) {
		Double[] input_data = { 5.0, 2.0, 7.8, 3.7, 8.2, 12.0, 54.9, 2.1, 57.9, 23.2, 87.7 };
		int N = 3;
		MovingAverage movingAverage = new MovingAverageQueue(N);
		for (Double x : input_data) {
			movingAverage.addData(x);
			System.out.println("New number added is " + x + ", Queue = " + Arrays.toString(movingAverage.getElements()) + ", SMA = " + movingAverage.getAverage());
		}
	}
}
