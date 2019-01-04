package lesson2;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		int sumint=0;
		System.out.println("Enter string to be converted");
		Scanner input = new Scanner(System.in);
		String str01=input.nextLine();
		System.out.println(str01);
		StringBuilder sb1 = new StringBuilder(str01.replaceAll("\\D+",""));
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1);
		for (int i=0; i<sb1.length(); i++) {
			 sumint=sumint+Integer.parseInt(Character.toString(sb1.charAt(i)));
			 //System.out.println(sumint);
		}
		System.out.println("Sum of digits is "+sumint);	  
		sb1.delete(0, sb1.length());
		//System.out.println(sb1);
		sb1.append(str01.replaceAll("[^a-zA-Z]", ""));
		System.out.println("a-Z symbols :  "+sb1);
		sb1.delete(0, sb1.length());
		System.out.println(sb1);
		sumint=0;
		if (str01.indexOf(" ")>=0) { // Find if " " exists
			sumint=sumint+1;
		}
		if (str01.indexOf(".")>=0) { // Find if "." exists
			sumint=sumint+1;
		}
		if (str01.indexOf(",")>=0) { // Find if "," exists
			sumint=sumint+1;
		}
		if (str01.indexOf("?")>=0) { // Find if "?" exists
			sumint=sumint+1;
		}
		if (str01.indexOf("!")>=0) { // Find if "!" exists
			sumint=sumint+1;
		}
		System.out.println("Number of spaces, point etc is: "+sumint);
		sb1.delete(0, sb1.length());
		
		sumint=str01.trim().replaceAll("\\s\\s", " ").length(); //delete double space
		sb1.append(str01.trim().replaceAll("\\s\\s", " "));
		sumint=sb1.length();
		while (sumint>sb1.toString().trim().replaceAll("\\s\\s", " ").length()) { //normalize string
			sb2.delete(0, sb2.length());
			sb2.append(sb1.toString().replaceAll("\\s\\s", " "));
			sb1=sb2;
			sumint=sb1.length();
		}
		System.out.println(sb1); 
		sumint=sb1.length()+1-sb1.toString().replaceAll("\\s", "").length();// 
		System.out.println("number of words is "+sumint);
		//System.out.println(sb1);
		//sb1.append(str01.replaceAll("\\s", ""));
		//System.out.println("1"+sb1+"1");
		
        sb1.delete(0, sb1.length());
        sb1.append(str01);
        long before = System.currentTimeMillis();
        for (int i = 0; i< 10000; i++ ) {
            sb1.append(sb2);
        }
        // узнаем текущее время после теста 
        long after = System.currentTimeMillis();
        // выводим результат
        System.out.println("StringBuilder: " + (after - before) + "ms.");
        String str02=sb2.toString();
		before = System.currentTimeMillis();
        for (int i = 0; i< 10000; i++ ) {
            str01.concat(str01);
        }
        // узнаем текущее время после теста 
        after = System.currentTimeMillis();
        // выводим результат
        System.out.println("String: " + (after - before) + "ms.");
        
	}
}
