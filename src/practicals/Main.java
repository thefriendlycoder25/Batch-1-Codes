package practicals;

import java.util.Scanner;

class negativeParam extends Exception{
	@Override
	public String getMessage() {
		return ("Please enter a positive value");
	}

	@Override
	public String toString() {
		return ("You have entered a negative value and caused and exception");
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	static void perimeter (int side) {
		while (side < 0) {
			try {
				throw new negativeParam();

			} catch (negativeParam np) {
				System.out.println(np.toString());
				System.out.println(np.getMessage());
				side = sc.nextInt();
			}
		}

		System.out.println("The perimeter is "+4*side);
	}
    public static void main(String[] args) {
		System.out.println("Enter the side of the square");
		int s = sc.nextInt();
		perimeter(s);

    }
}
