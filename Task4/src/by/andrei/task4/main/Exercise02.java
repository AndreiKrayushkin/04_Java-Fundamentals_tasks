package by.andrei.task4.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = 0;
		while (sizeArr <= 0) {
			System.out.println("Введите размер матрицы: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeArr = sc.nextInt();
		}
		
		int stringArr = 0;
		while (stringArr <= 0 || stringArr > sizeArr) {
			System.out.println("Введите cтроку: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			stringArr = sc.nextInt();
		}
		
		int columnArr = 0;
		while (columnArr <= 0 || columnArr > sizeArr) {
			System.out.println("Введите столбец: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			columnArr = sc.nextInt();
		}
		
		Random rand = new Random();
		System.out.println("Исходная матрица: ");
		int[][] ms = new int[sizeArr][sizeArr];
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = rand.nextInt(100);
				System.out.printf("[%2d]", ms[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println(stringArr + " строка матрицы: ");
		
		stringArr = stringArr - 1;		//т.к. нумерация элементов идет с 0
		for (int j = 0; j < ms.length; j++) {
			System.out.printf("%3d", ms[stringArr][j]);			
		}
		System.out.print("\n");
		
		System.out.println(columnArr + " столбец матрицы: ");
		
		columnArr = columnArr - 1;		//т.к. нумерация элементов идет с 0
		for (int i = 0; i < ms.length; i++) {
			System.out.printf("%3d", ms[stringArr][columnArr]);	
		}

	}

}
