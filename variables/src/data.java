

public class data {

	public static void main(String[] args) {
		
		Variables variables = new Variables();
		variables.setM(33);
		
		Variables variables2 = new Variables();
		variables2.setM(20);
		
		if (variables.getM()== variables2.getM()) {
			System.out.println("they are same");
		} else {
			System.out.println("they are not same");
		}
		
		variables = null;
		variables2 = null;
	}

}
