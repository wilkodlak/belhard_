package exb1;

/* 
 2. Новогодний подарок. Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного
из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Lesson04exb1 {
	public static void main(String[] args) {
		int presentCandiesWeight = 0;
		CandyCane candy1 = new CandyCane("СandyCane1", 12, 4, 5);
		CandyCane candy2 = new CandyCane("СandyCane2", 11, 3, 4);
		Toffee candy3 = new Toffee("Toffee1", 14, 5, 6);
		Toffee candy4 = new Toffee("Toffee2", 15, 2, 6);
		Roast candy5 = new Roast("Roast1", 6, 3, 3);
		Roast candy6 = new Roast("Roast2", 7, 3, 3);
		System.out.println(candy6.getName());
		List<Candy> Present = Arrays.asList(candy1, candy2, candy3, candy4, candy5, candy6);
//	System.out.println((Roast)Present.get(5).getMilk());
		Present.forEach(candy_ -> {
			System.out.println(" " + candy_.getName() + " weight " + candy_.getWeight());
		});
		for (int i = 0; i < Present.size(); i++) {
			presentCandiesWeight = presentCandiesWeight + Present.get(i).getWeight();
		}
		System.out.println("Present's weight is " + presentCandiesWeight);
		Collections.sort(Present);
		Present.forEach(candy_ -> {
			System.out.println(" " + candy_.getName() + " weight " + candy_.getWeight());
		});
		System.out.println(" Sugar");
		Present.forEach(candy_ -> {
			if ((candy_.getSugarWeight() >= 4) && (candy_.getSugarWeight() <= 5)) {
				System.out.println(
						" " + candy_.getName() + " weight " + candy_.getWeight() + " sugar " + candy_.getSugarWeight());
			}
			;
		});
	}

}
