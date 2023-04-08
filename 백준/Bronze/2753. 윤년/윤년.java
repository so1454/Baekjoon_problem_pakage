import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double year1 = sc.nextInt();
		
		if((year1 % 400 == 0) || (year1 % 4 == 0) && (year1%100 !=0) ) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
		
		
	}

}