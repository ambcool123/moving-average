package com.ambcool;

/**
 * An interface to a collection that will have methods to add 
 * data and get moving average of n number of elements
 * 
 * @author ambrishambekar
 */
public interface MovingAverage {
	
	/**
	 * Add element into the data structure
	 * 
	 * @param element Element to be added to data structure
	 */
	public void addData(Double elemnet);
	
	/**
	 * Returns the current average of elements in the data structure
	 * @return the current average of elements in the data structure 
	 */
	public double getAverage();
	
	/**
	 * Returns elements of the data structure
	 * @return elements of the data structure
	 */
	public Double[] getElements();

}
