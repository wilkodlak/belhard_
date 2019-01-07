package December28Chapter06;
/*
 * 2. —оздайте простую игру основанную на угадывании букв (буква задаетс€
 * случайным образом). ѕользователь должен угадать загаданную букву A-Z введ€ ее
 * в консоль. ≈сли пользователь угадал букву программа выведет ЂRightї и игра
 * закончитс€, если нет, то пользователь продолжит вводить буквы. (ќпционально)
 * ¬ывести ЂYouТre too lowї- если пользователь ввел букву меньше загаданной,
 * ЂYouТre too highї- если пользователь ввел букву больше загаданной.
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;
public class GameDecember28 {
	public static void main(String[] args) {
		Random random = new Random();
		char sourcechar = (char)(random.nextInt(26) +(int)'a' );
        System.out.println(sourcechar);// ѕечать загаданного символа (отладка)		
		Scanner reader = new Scanner(System.in);
        char c=' ';
		while (c!=sourcechar) { 
		System.out.println("Enter char between 'a' and 'z' to be checked");
		c = reader.next().charAt(0);
		if (c>='a' & c <='z') {
			if (c>sourcechar) {
				System.out.println("YouТre too high");
			} else {if (c<sourcechar) {
				System.out.println("YouТre too low");
			}}
			
		} else {
			System.out.println("It is not a char between 'a' and 'z'");
		}
        //System.out.println(c);// ѕечать введенной строки
		}
		reader.close();
		System.out.println("!!! You are WIN !!!");
	}
}
