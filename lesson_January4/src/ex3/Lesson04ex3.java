package ex3;

/* 
 9. ������� ������ ������ ����, ��������� ������ �����, ����������.
������: ������� ��������, ��������� �������, ����������� �������������� ����� ������� �����.
 */
public class Lesson04ex3 {
	public static void main(String[] args) {
		Point simplePoint = new Point(5, 6);
		Round simpleRound = new Round(new Circle(0, 0, 12), 127);
		
		if (simpleRound.incideRound(simplePoint)) {
			System.out.println("The point is in the Round");
		} else {
			System.out.println("The point is out the Round");
		}
		;

	}

}
