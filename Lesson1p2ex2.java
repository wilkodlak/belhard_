import java.util.Random;
public class Lesson1p2ex2 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int sec=random.nextInt(65535) + 1;
        int dev;
        System.out.println(sec);
        for (dev=2;dev<sec;dev++)
           {
           if (sec%dev==0) 
              {
              
              break;
              }
           }
        if ((sec>2)&&(dev>1)&&(dev<sec)) 
            {
            System.out.println(" не простое, делится на "+dev);
            }
            else 
            {
            System.out.println("простое");
            }
        }
    }