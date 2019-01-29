package lessonJan25Ex2;

/*
 * 2.Записать в текстовый файл список файлов и каталогов любого выбранного каталога 
 * на диске.

 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LessonJan25ex02 {
	private static ArrayList<File> listWithFileNames = new ArrayList<>();

	public static void main(String[] args) {
		getListFiles("D:\\dev");

		try {
			FileWriter writer = new FileWriter("d:\\dev\\Letter.txt", false);

			for (File fil : listWithFileNames) {
				System.out.println(fil.getName());
				writer.write(fil.getName());
				;
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void getListFiles(String str) {
		try {
			File f = new File(str);
			if (f.exists()) {
			System.out.println("Make file List");
			try {
				for (File s : f.listFiles()) {
					if (s.isFile() || s.isDirectory()) {
						listWithFileNames.add(s);
					}
				}
			} finally {
			}}else {System.out.println("No such directiry "+str);}
		} finally {
		}
	}

}
