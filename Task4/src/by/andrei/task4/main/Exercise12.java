package by.andrei.task4.main;

import java.util.Random;

public class Exercise12 {

	public static void main(String[] args) {
		Random rand = new Random();
		int sizeColumnArr = rand.nextInt(20)+1;	//для исключения нулевых значений
		int sizeStringArr = rand.nextInt(20)+1;	//для исключения нулевых значений
		int[][] ms = new int[sizeStringArr][sizeColumnArr];
		 System.out.println("Количество столбцов = " + sizeColumnArr + "; количество строк = " + sizeStringArr);
		// проходим по столбцам
		for (int j = 0; j < sizeColumnArr; j++) {
			int number = 0; // счетчик
			for (int i = 0; i < sizeStringArr; i++) {
					if (number < j) {		//если счетчик меньше количества столбцов					
						ms[i][j] = 1;		//записываем единицу, пока счетчик не будет равен номеру столбца
						number++;
					} else 
						ms[i][j] = 0;
			}
		}
		System.out.println("\n");
		// проход по строкам
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				System.out.printf("[%2d]", ms[i][j]);
			}
			System.out.print("\n");
		}

	}
}
