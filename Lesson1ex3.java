import java.util.Random;
public class Lesson1ex3 
    {public static void main(String[] args)
        {
        Random random = new Random();
        double r=random.nextFloat()*10000;
        double a=random.nextFloat()*10000;
        double b=random.nextFloat()*10000;
        System.out.println(r+" "+a+" "+b);
        //int sec=12;
        if (4*r*r>=a*a+b*b) {System.out.println("можно");}  else {System.out.println("нельзя");} ;
        
        }
    }