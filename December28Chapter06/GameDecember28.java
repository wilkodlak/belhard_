package December28Chapter06;
/*
 * 2. �������� ������� ���� ���������� �� ���������� ���� (����� ��������
 * ��������� �������). ������������ ������ ������� ���������� ����� A-Z ����� ��
 * � �������. ���� ������������ ������ ����� ��������� ������� �Right� � ����
 * ����������, ���� ���, �� ������������ ��������� ������� �����. (�����������)
 * ������� �You�re too low�- ���� ������������ ���� ����� ������ ����������,
 * �You�re too high�- ���� ������������ ���� ����� ������ ����������.
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;
public class GameDecember28 {
	public static void main(String[] args) {
		Random random = new Random();
		char sourcechar = (char)(random.nextInt(26) +(int)'a' );
        System.out.println(sourcechar);// ������ ����������� ������� (�������)		
		Scanner reader = new Scanner(System.in);
        char c=' ';
		while (c!=sourcechar) { 
		System.out.println("Enter char between 'a' and 'z' to be checked");
		c = reader.next().charAt(0);
		if (c>='a' & c <='z') {
			if (c>sourcechar) {
				System.out.println("You�re too high");
			} else {if (c<sourcechar) {
				System.out.println("You�re too low");
			}}
			
		} else {
			System.out.println("It is not a char between 'a' and 'z'");
		}
        //System.out.println(c);// ������ ��������� ������
		}
		reader.close();
		System.out.println("!!! You are WIN !!!");
	}
}
