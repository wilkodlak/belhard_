package exb2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exb1.Candy;
import exb1.CandyCane;
import exb1.Roast;
import exb1.Toffee;

import java.util.Collections;
import java.util.*;

/*
 5. Звукозапись. Определить иерархию музыкальных композиций. Записать
на диск сборку. Подсчитать продолжительность. Провести перестановку
композиций диска на основе принадлежности к стилю. Найти композицию,
соответствующую заданному диапазону длины треков.
 */
public class Lesson04exb2 {
	public static void main(String[] args) {
		int diskLength = 0;
		// String name, String author, int year, int recordLength, String style
		Composition candy1 = new Composition("mmm1", " aaa1", 1999, 15272, "S2");
		Composition candy2 = new Composition("mmm4", " aaa1", 1999, 6710, "S2");
		Composition candy3 = new Composition("mmm4", " aaa2", 1899, 16710, "S1");
		Composition candy4 = new Composition("mmm2", " aaa3", 1999, 6910, "S3");
		Composition candy5 = new Composition("mmm3", " aaa3", 2001, 16710, "S4");
		Composition candy6 = new Composition("mmm4", " aaa1", 1999, 13710, "S2");
		System.out.println(candy6.getName());
		List<Composition> Disk = Arrays.asList(candy1, candy2, candy3, candy4, candy5, candy6);

		for (int i = 0; i < Disk.size(); i++) {
			diskLength = diskLength + Disk.get(i).getRecordLength();
		}
		System.out.println(" Disk's length is " + diskLength);

		Disk.forEach(rec -> {
			System.out.println(rec.getName() + " " + rec.getAuthor() + " " + rec.getStyle());
		});
		Collections.sort(Disk);
		System.out.println("After sorting");
		Disk.forEach(rec -> {
			System.out.println(rec.getName() + " " + rec.getAuthor() + " " + rec.getStyle());
		});
		if (Disk.size() > 0) {
			Collections.sort(Disk, new Comparator<Composition>() {
				@Override
				public int compare(final Composition object1, final Composition object2) {
					return object1.getStyle().compareTo(object2.getStyle());
				}
			});
		}

		System.out.println("After sorting by style");
		Disk.forEach(rec -> {
			System.out.println(rec.getName() + " " + rec.getAuthor() + " " + rec.getStyle());
		});
		System.out.println(" Check length  between 10000 and 16000");
		Disk.forEach(rec_ -> {
			if ((rec_.getRecordLength() >= 10000) && (rec_.getRecordLength() <= 16000)) {
				System.out.println(
						" " + rec_.getName() + " Author " + rec_.getAuthor() + " length " + rec_.getRecordLength());
			}
			;
		});
	}

}
