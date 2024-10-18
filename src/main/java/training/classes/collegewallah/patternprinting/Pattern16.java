package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern16 {

	public static void printPattern(int row){

		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				int k=0;
				if(i%2==0 && j%2==0){
					k=1;
					System.out.print(k);
				}
				else if(i%2!=0 && j%2!=0){
					k=1;
					System.out.print(k);
				}
				else{
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

	public static void printPattern2(int row){

		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				if((i+j)%2==0){
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		printPattern(row);

		System.out.println("===========");
		printPattern2(row);

		scanner.close();
	}
}
