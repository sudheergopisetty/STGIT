package com.Main;

//import com.Model.MyInterface;
import com.Model.MyinterfaceImpl;
import com.Model.ScientificCal;

public class MainApp {

	public static void main(String[] args) {
		// interfaceName var = new interfaceImpl();
		//MyInterface myInterface = new MyinterfaceImpl();
		ScientificCal scientificCal = new MyinterfaceImpl();
		System.out.println("sumof two :"+scientificCal.add(2, 4));
		System.out.println("sumof two :"+scientificCal.sub(4, 2));
		System.out.println("sumof two :"+scientificCal.mul(2, 4));
		System.out.println("sumof two :"+scientificCal.div(4, 2));
		System.out.println("sumof two :"+scientificCal.mod(4, 2));

	}

}
