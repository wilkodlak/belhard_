import java.util.Random;
public class Lesson1ex2 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int sec=random.nextInt(65535) + 1;
        //int sec=12;
        System.out.println(sec);
        if ((sec/1000==0) && (sec/100>0)) {System.out.println("трехзначное");}  else {System.out.println("не трехзначное");} ;
        if ((sec%10==7)) {System.out.println("заканчивается на 7");}  else {System.out.println("не заканчивается на 7");} ;
        if ((sec%2==0)) {System.out.println("Четное");}  else {System.out.println("нечетное");} ;
        
        }
    }