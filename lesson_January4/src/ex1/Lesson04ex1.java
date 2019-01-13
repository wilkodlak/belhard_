package ex1;
/* 
 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Lesson04ex1 {
	public static void main(String[] args) {
		Engine engM = new Engine(12,23456);
		Wheel firstWheel = new Wheel(25,15,1,2) ; //int id, int radius, int season, int pressure
		Wheel secondWheel = new Wheel(25,15,1,2) ; //int id, int radius, int season, int pressure
		Wheel thirdWheel = new Wheel(25,15,1,2) ; //int id, int radius, int season, int pressure
		Wheel fourthWheel = new Wheel(25,15,1,2) ; //int id, int radius, int season, int pressure
		Car moskvich= new Car(23457, 22, 127, engM,firstWheel,secondWheel, thirdWheel, fourthWheel);
		//int id, int model, int color, Engine carEngine, Wheel leftTopWheel, Wheel rightTopWheel, Wheel leftBottomWheel,Wheel rightBottomWheel
		moskvich.showModel();
	}

}
