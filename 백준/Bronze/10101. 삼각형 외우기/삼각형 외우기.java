import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		}
		else if(a+b+c == 180 && (a == b || b == c || c == a)) {
			System.out.println("Isosceles");
		}
		else if(a+b+c == 180 && (a != b && b != c && c != a)) {
			System.out.println("Scalene");
		}
		else if(a+b+c != 180) {
			System.out.println("Error");
		}
	}
}