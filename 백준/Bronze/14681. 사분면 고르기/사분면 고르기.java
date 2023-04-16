import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numx = sc.nextInt();
		int numy = sc.nextInt();
		
		if(numx < 0 && numy >0 ) {
			System.out.println("2");
		}else if (numx > 0 && numy > 0 ) {
			System.out.println("1");
		}else if(numx <0 && numy<0) {
			System.out.println("3");
		}else if(numx > 0 && numy< 0 ) {
			System.out.println("4");
		}

		
		sc.close();
		
		
	}

}