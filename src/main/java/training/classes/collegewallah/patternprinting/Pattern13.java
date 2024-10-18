package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern13 {

	public static void printPattern(int row,int column){

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(i==0||i==row-1||j==0||j==column-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int row = scanner.nextInt();
		int col = scanner.nextInt();
		printPattern(row,col);

		scanner.close();
	}
}
