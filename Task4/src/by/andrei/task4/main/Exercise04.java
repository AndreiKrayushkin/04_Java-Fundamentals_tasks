package by.andrei.task4.main;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while ((sizeArr <= 0) || !(sizeArr % 2 == 0)) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введите размер массива: ");
				sc.next();
			}
			sizeArr = sc.nextInt();
		}

		int[][] ms = new int[sizeArr][sizeArr]; 
		
		for (int i = 0; i < ms.length; i++) {
			if (i % 2 == 0) {
				int a1 = 1;		//записываемое число
				for (int j = 0; j < ms[i].length; j++) {
					ms[i][j] = a1++;
					System.out.printf("[%2d]", ms[i][j]);
				}
			} else {
				int a2 = sizeArr;	//записываемое число
				for (int j = ms[i].length - 1; j >=0; j--) {
					ms[i][j] = a2--;
					System.out.printf("[%2d]", ms[i][j]);
				}
			}
			System.out.print("\n");
		}

	}
	
}
