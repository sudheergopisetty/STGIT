package com.Service;

public class OuterClass {

	private int a;
	
	public int outerMethod(int a) {
		return a + 100;
	}
	
	public class InnerClass{
		private int b;
		
		public void innerDisplay() {
			System.out.println("outer cass variable" + a);
			//inner class
		System.out.println(	outerMethod(20));
		}
	}
}
