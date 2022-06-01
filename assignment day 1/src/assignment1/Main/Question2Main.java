package assignment1.Main;

import assignment1.Model.Question2;

public class Question2Main {

	public static void main(String[] args) {
		Question2 question2 = new Question2();
		System.out.println("sum of numbers "+question2.add(20, 4));
		System.out.println("subtraction of numbers "+question2.sub(20, 4));
		System.out.println("multiplication of numbers "+question2.mul(20, 4));
		System.out.println("division of numbers "+question2.div(20, 4));
		System.out.println("remainder of numbers "+question2.mod(20, 4));

	}

}
