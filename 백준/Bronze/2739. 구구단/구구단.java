import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int j = 1; j <= 9; j++) {
			System.out.println(a + " * " + j + " = " + a*j);
		}
	}
}