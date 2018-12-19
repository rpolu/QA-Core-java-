package com.test;
import com.att.Employee;
import com.ds.*;
public class Test {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.display();
		//int hashCode=a.hashCode();
		//System.out.println(hashCode);
		int x=45;
		System.out.println(x);
		
		System.out.println(a);// toString()
		
		
		
		Employee e1=new Employee();
		e1.setEmpID(12);
		e1.setName("rama");
		
		Employee e2=new Employee();
		e2.setEmpID(12);
		e2.setName("rama");
		
		if(e1.hashCode()==e2.hashCode()) {
			System.out.println("equaL");
		}else{
			System.out.println("not equal");
		}
			
		
	}
}
