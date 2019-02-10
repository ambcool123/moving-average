package com.ambcool.impl;

import java.util.LinkedList;
import java.util.Queue;

import com.ambcool.MovingAverage;

/**
 * Queue implementation of the {@code MovingAverage} interface. Implements all
 * the moving average operations.
 * 
 * @author ambrishambekar
 *
 */
public class MovingAverageQueue implements MovingAverage {

	/**
	 * Data structure used to store elements on which moving average will be
	 * calculated
	 */
	private final Queue<Double> queue;

	/**
	 * Last <code>N</code> elements on which moving average will be calculated
	 */
	private final int N;

	/**
	 * The current sum of <code>N</code> elements in the <code>queue</code>
	 */
	private Double sum;

	/**
	 * Constructs a empty MovingAverageQueue instance
	 * 
	 * @param N size of the <code>MovingAverageQueue</code>
	 */
	public MovingAverageQueue(int N) {
		this.queue = new LinkedList<Double>();
		this.N = N;
		this.sum = 0.0;
	}

	/**
	 * Add element into <code>MovingAverageQueue</code>
	 * 
	 * @param element element to be added to <code>MovingAverageQueue</code>
	 */
	@Override
	public void addData(Double element) {
		this.sum += element;
		this.queue.add(element);

		if (this.queue.size() > N) {
			sum -= this.queue.remove();
		}
	}
	
	/**
	 * Returns elements of the queue
	 * @return elements of the queue
	 */
	@Override
	public Double[] getElements() {
		return queue.toArray(new Double[queue.size()]);
	}

	/**
	 * Returns average from the <code>MovingAverageQueue</code>
	 * 
	 * @return average from the <code>MovingAverageQueue</code>
	 */
	@Override
	public double getAverage() {
		return this.sum/this.queue.size();
	}

}
