import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (min < 45 && hour>0 ) {
			min = 60- 45 +min;
			hour = hour -1 ;
		}else if (min < 45 && hour == 0) {
			min = 60- 45 +min;
			hour = 24 - 1 ;
		}else {
			min = min - 45;
		}
		
		System.out.println(hour + " " + min);

		
	}
}