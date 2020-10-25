package by.andrei.task4.main;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while ((sizeArr <= 0) || !(sizeArr % 2 == 0)) {
			System.out.println("Введите размер массива, кратный 2: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введите размер массива, кратный 2: ");
				sc.next();
			}
			sizeArr = sc.nextInt();
		}
		int[][] ms = new int[sizeArr][sizeArr];

		int a = 1;		//записываемое число
		for (int i = 0; i < ms.length ; i++) {
			for (int j = ms[i].length-1; j >= 0; j--) {
				if (i == j) {
					ms[i][j] = a++;
					System.out.printf("[%2d]", ms[i][j]);
				} else {
					ms[i][j] = 0;
					System.out.printf("[%2d]", ms[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	
}
