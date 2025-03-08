// Program #3: Pascal App
package week_7;

import java.util.Scanner;

//import java.util.ArrayList;

public class Program3 {

	static Scanner inputscanner = new Scanner(System.in);
	
	public static void main(String[] args) {

//		Initialize/declare variables.
		int lnlen;
		int[][] triangle = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

//		Generate triangle.
		for (int rowind = 1; rowind < 11; rowind++) {
			for (int colind = 0; colind < triangle[rowind].length; colind++) {
				if (((colind > 0) && (colind < triangle[rowind - 1].length)) || !(triangle[rowind][colind] == 0)) {
					triangle[rowind][colind] = triangle[rowind - 1][colind - 1] + triangle[rowind - 1][colind];
				} else if ((colind == 0) || (colind < triangle[rowind].length)) {
					triangle[rowind][colind] = 1;
				}
			}
		}

//		Print triangle.
		System.out.println("Welcome to the Pascal App! Its purpose is simple: to display a portion of Pascal's Triangle"
				+ ".\nPascal's Triangle to 11 lines:\n");
		int fieldwidth = triangle[triangle.length - 1].length;
		for (int row[] : triangle) {
			lnlen = 0;
			for (int i : row) {
				if (!(i == 0)) {
					lnlen += 1;
				}
			}
			System.out.print(" ".repeat((fieldwidth - lnlen) * 2));
			for (int col : row) {
				if (!(col == 0)) {
					System.out.format("%4s", col);
				}
			}
			System.out.println();
		}
			
//		End program. Used to keep window open when run from CLI.
		System.out.println("\n\nProgram finished. Press [enter] to close.");
		inputscanner.next();
	}
}