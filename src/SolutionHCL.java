import java.util.Scanner;

public class SolutionHCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testCount = Integer.parseInt(sc.nextLine());

		for (int testCase = 0; testCase < testCount; testCase++) {
			String case1 = sc.nextLine();
			String data[] = case1.split(" ");
			int hight = Integer.parseInt(data[0]);
			int quantity = Integer.parseInt(data[1]);

			creteTringle1(hight);

		}
	}

	private static void creteTringle1(int hight) {
		int i, j, k;
		for (i = 1; i <= hight; i++) {
			for (j = i; j < hight; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == hight || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (j = i; j < hight; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == hight || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
