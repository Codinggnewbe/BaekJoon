import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i = n; i > 0; i--) {
			for(int j = i; j > 0; j--) { // 실질 출력
					System.out.print("*");
			}
			System.out.println();
		}
	}
}