package com.training.arrays;

public class ExampleOnArray4 {

	public static void main(String[] args) {
		
		//dataType arrayName = new dataType[size]
		Employee emp[] = new Employee[3];
		
		Employee e1 = new Employee(1001,"sravan", 4000);
		Employee e2 = new Employee(1003,"raju", 5000);
		Employee e3 = new Employee(1004,"martin", 6000);
		
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		
		for(int i=0;i<emp.length;i++) {
			Employee eoby=emp[i];
			System.out.println(eoby.empId+" "+eoby.empName+" "+eoby.sal);
			
		}
		
		
		
	}
}
