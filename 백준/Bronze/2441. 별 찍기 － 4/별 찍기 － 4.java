import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			int j = 0;
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(j = num - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}