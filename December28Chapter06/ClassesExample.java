package December28Chapter06;

/* 6. ������� �������� ������� ��� �������� ��������������� � ��������� �������� �������
������ (������� 1). ������������� � ��� ������ ��������� � ����������, � ��� �� ������,
����������� ����������� ��� ������� ���������� ������� �������� (���������) 
*/
import java.util.Scanner;


/*	public class SimpleLamp extends LightBulb { // ����� ������� �����
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
		DigitalTV stasTV = new DigitalTV(1,7,13,93, 13,12,11,true,255,true); 
		stasTV.setTurnOn(true);
		stasTV.setDigitalChannel(13);
	}
	

}
