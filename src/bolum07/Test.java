package bolum07;

public class Test {
	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3 };
		int[] list2 = list1;
		list2[1] = 10;
		System.out.println(list1[1]);
	}
}
