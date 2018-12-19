import java.util.Random;
public class Lesson1ex5 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int r=random.nextInt(9000)+1000 ;
        System.out.println(r);
        //int sec=12;
        int i= (r/1000)+ ((r/10)%10)*100+((r/100)%10)*10+(r%10)*1000;
        System.out.println(i);
        
        }
    }