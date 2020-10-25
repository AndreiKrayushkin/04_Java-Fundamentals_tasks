package by.andrei.task4.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sizeStringArr = 0;
		while (sizeStringArr <= 0) {
			System.out.println("Введите количество cтрок: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeStringArr = sc.nextInt();
		}
		
		int sizeColumnArr = 0;
		while (sizeColumnArr <= 0) {
			System.out.println("Введите количество столбцов: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeColumnArr = sc.nextInt();
		}
		System.out.println("Исходная матрица: ");
		Random rand = new Random();
		int[][] ms = new int[sizeStringArr][sizeColumnArr];
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = rand.nextInt(100);
				System.out.printf("[%2d]", ms[i][j]);
			}
			System.out.print("\n");
		}

		System.out.println("\nИзмененная матрица:");
		for (int i = 0; i < ms.length; i++) {
			if (i % 2 == 0) {
				for (int j = ms[i].length - 1; j >= 0; j--) {
					System.out.printf("[%2d]", ms[i][j]);
				}
			} else {
				for (int j = 0; j < ms[i].length; j++) {
					System.out.printf("[%2d]", ms[i][j]);
				}
			}
			System.out.print("\n");

		}
	}

}
