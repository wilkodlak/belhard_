package lessonJan25Ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
 * 1. Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать 
 * числа и их среднее арифметическое.

 */

public class LessonJan25Ex01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Random random = new Random();
		int num = 0;
		int count = 20;
		try (FileWriter writer = new FileWriter("d:\\dev\\Letter.txt", false);) {
			for (int i = 0; i < count; ++i) {
				num = random.nextInt(50) + 1;
				System.out.println(num);
				writer.write(num);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("==============================================");// separator

		try (BufferedReader in = new BufferedReader(new FileReader("d:\\\\dev\\\\Letter.txt"));) {
			// String text;
			int sum = 0;
			count = 0;
			while (in.ready()) { // читаем файл
				num = in.read(); // запоминаем число
				sum = sum + num;
				count = count + 1;
				System.out.println(num);
			}
			System.out.println("Среднее арифметическое: " + ((0.0 + sum) / count));
			in.close();
		}

		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
