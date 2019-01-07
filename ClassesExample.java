package lesson2;

/* 7. Создать иерархию классов для домашних электроприборов и несколько объектов каждого
класса (минимум 1). Предусмотреть в них методы включения и выключения, а так же методы,
описывающие специфичные для каждого отдельного прибора свойства (поведение) 
*/
import java.util.Scanner;


/*	public class SimpleLamp extends LightBulb { // Класс простая лампа
	private boolean bulbOn;
	SimpleLamp {
		
	}
} */
public class ClassesExample {
	

	public static void main(String[] args) {
		System.out.printf(" Black-wite TV: \n");
		TV basylTV = new TV(1,7,13,3); 
		basylTV.setTurnOn(true);
		System.out.printf(" Color TV: \n");
		ColorTV michalTV = new ColorTV(1,7,13,99, 13,12,11,true); 
		michalTV.setTurnOn(true);
	}
	

}
