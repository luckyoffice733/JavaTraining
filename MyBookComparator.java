package com.training.map;

import java.util.Comparator;

public class MyBookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		 int bid1 = o1.getBookId();
		 int bid2 = o2.getBookId();
		 
		 if(bid1 < bid2) {
			 return -1;
		 }else if(bid1>bid2) {
			 return 1;
		 }else {
			 return 0;
		 }
	}

}
