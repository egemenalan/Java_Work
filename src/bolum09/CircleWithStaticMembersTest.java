package bolum09;

public class CircleWithStaticMembersTest {

	public static void main(String[] args) {

		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObject);

		CircleWithStaticMembers circle1 = new CircleWithStaticMembers();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + circle1.radious + ") and number of Circle objects ("
				+ CircleWithStaticMembers.numberOfObject + ")");

		CircleWithStaticMembers circle2 = new CircleWithStaticMembers(5);

		circle1.radious = 9;

		System.out.println("\nAfter creating circle2 and modifying circle1");
		System.out.println("circle1: radius (" + circle1.radious + ") and number of Circle objects ("
				+ circle1.numberOfObject + ")");
		System.out.println("circle2: radius (" + circle2.radious + ") and number of Circle objects ("
				+ circle2.numberOfObject + ")");
	}

}
