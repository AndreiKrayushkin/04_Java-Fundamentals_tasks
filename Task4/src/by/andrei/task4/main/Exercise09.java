package by.andrei.task4.main;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while ((sizeArr <= 0) | !(sizeArr % 2 == 0)) {
			System.out.println("Введите размер массива, кратно 2: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введите размер массива, кратно 2: ");
				sc.next();
			}
			sizeArr = sc.nextInt();
		}
		
		long[][] ms = new long[sizeArr][sizeArr];
		
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = (long) Math.pow(j+1, i+1);
				System.out.printf("[%8d]", ms[i][j]);
			}
			System.out.print("\n");
		}
	}
	
}
