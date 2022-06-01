package test;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value a :");
		int a = scanner.nextInt();
		System.out.println("enter value b :");
		int b = scanner.nextInt();
		System.out.println("sum of a , b :");
		System.out.println(a+b);
	}
}

