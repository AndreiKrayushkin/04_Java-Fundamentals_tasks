package by.andrei.task4.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		int count = 0;
		while (sizeArr <= 0) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeArr = sc.nextInt();
		}
		Random rand = new Random();
		int[][] ms = new int[sizeArr][sizeArr];
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = rand.nextInt(100)-50;
				System.out.printf("[%3d]", ms[i][j]);
				if (ms[i][i] > 0) {
					count++;
				}
			}
			System.out.print("\n");
		}
		if (count > 0) {
			System.out.println("Положительные числа главной диагонали: ");
			for (int i = 0; i < ms.length; i++) {
				if (ms[i][i] > 0) {
					System.out.print(ms[i][i] + ", ");
				}
			}
		} else {
			System.out.println("Положительные числа в главной диагонали отсутствуют");
		}
	}
	
}
