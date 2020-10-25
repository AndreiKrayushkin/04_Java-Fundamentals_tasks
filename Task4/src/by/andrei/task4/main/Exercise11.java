package by.andrei.task4.main;

import java.util.Random;

public class Exercise11 {

	public static void main(String[] args) {
		int sizeStringArr = 10;		//количество строк
		int sizeColumnArr = 20;		//количество столбцо
		int meetNumber = 5;			//число, которое ищем
		int minCountMeet = 3;		//количество повторений
		
		int[][] ms = new int[sizeStringArr][sizeColumnArr];
		
		Random rand = new Random();
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				ms[i][j] = rand.nextInt(16);
				System.out.printf("[%2d]", ms[i][j]);
			}
			System.out.print("\n");
		}
		
		int sizeArrNew = 0;
		for (int i = 0; i < ms.length; i++) {
			int count = 0;		//счетчик символов в строке
			for (int j = 0; j < ms[i].length; j++) {
				if (ms[i][j] == meetNumber) {	
					count++;
				}
				if (count >= minCountMeet) {
					sizeArrNew++;				//счетчик для размера новой матрицы
				}
			}
		}
		int[] ms2 = new int[sizeArrNew];
		int sh = 0;						//номер позиции в матрице
		for (int i = 0; i < ms.length; i++) {
			int count2 = 0;
			for (int j = 0; j < ms[i].length; j++) {
				if (ms[i][j] == meetNumber) {
					count2++;
				}
			}
			if (count2 >= minCountMeet) {
				ms2[sh] = i+1;
				System.out.println("Номер строки, в которой число " + meetNumber + " повторяется " + minCountMeet + " раза и больше: " + ms2[sh] );
				sh++;				
			}
		}
		//проверка на отсутстве необходимых условий		
		if (sh == 0) {
			System.out.println("Строки, в которых число " + meetNumber + " повторяется " + minCountMeet + " раза и больше - отсутствуют.");
		}
	}
}
