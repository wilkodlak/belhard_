import java.util.Random;
public class Lesson1p2ex2 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int sec=random.nextInt(65535) + 1;
        boolean si=false;
//        sec=6;
//        System.out.println(sec);
        for (int dev=2;dev<sec/2+1;dev++)
           {
           if (sec%dev==0) 
              {
              si=true;
              break;
              }
           }
        if (si) 
            {
            System.out.println(""+ sec+" is not simple");
            }
            else 
            {
            System.out.println(""+sec+ " is simple");
            }
        }
    }