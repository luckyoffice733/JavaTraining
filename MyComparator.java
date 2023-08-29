package com.training.set;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//int val=  o1.compareTo(o2);

		/*
		 * if(val<0) { return 1; }else if(val >0) { return -1; }else { return 0; }
		 */

		// TODO Auto-generated method stub

		if(o1 < o2) { 
			return 1; 
		}else if(o1 > o2) { 
			return -1; 
		}else 
		{ return 0
	   ; }

	}

}
