package by.andrei.task4.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while (sizeArr <= 0) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeArr = sc.nextInt();
		}
		
		Random rand = new Random();
		int[][] ms = new int[sizeArr][sizeArr];
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = rand.nextInt(100);
				System.out.printf("[%2d]", ms[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Элементы, стоящие по диагонали: ");
		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i][i]);
		}
	}
	
}
