package day1.Main;

import day1.Model.InterfaceTwo;
import day1.Model.IntyerfaceOne;
import day1.Model.MyClassImpl;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		IntyerfaceOne intyerfaceOne = new MyClassImpl();
		System.out.println(intyerfaceOne.add(5, 5));
		
		InterfaceTwo interfaceTwo = new MyClassImpl();
		System.out.println(interfaceTwo.sub(5, 5));
		
		MyClassImpl myClassImpl = new MyClassImpl();
		System.out.println(myClassImpl.add(2, 2));
		System.out.println(myClassImpl.sub(2, 5));
	}

}
