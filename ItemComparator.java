package com.training.set;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		
		//sorting based on id
		/*
		 * // TODO Auto-generated method stub int i1 = o1.getItemId(); int i2 =
		 * o2.getItemId();
		 * 
		 * if(i1<i2) { return 1; }else if(i1>i2) { return -1; }else { return 0; }
		 */
		 int val = o1.getItemName().compareTo(o2.getItemName());
		 if(val < 0) {
			 return 1;
		 }else if(val >0) {
			 return -1;
		 }else {
			 return 0;
		 }
		
	}

}
