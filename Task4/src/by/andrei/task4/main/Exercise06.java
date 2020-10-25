package by.andrei.task4.main;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while ((sizeArr <= 0) || !(sizeArr % 2 == 0)) {
			System.out.println("Введите размер массива, кратно 2: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введите размер массива, кратно 2: ");
				sc.next();
			}
			sizeArr = sc.nextInt();
		}	
		
		int[][] ms = new int[sizeArr][sizeArr];
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				if (i == 0 | i == (sizeArr-1) | j == 0 | j == (sizeArr-1)) {
					ms[i][j] = 1;
					System.out.printf("[%3d]", ms[i][j]);
				} else {
					ms[i][j] = 0;
					System.out.printf("[%3d]", ms[i][j]);
				}
			}
			System.out.print("\n");
		}
		
	}
	
}
