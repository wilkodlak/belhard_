import java.util.Random;
public class Lesson1ex4 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int r=random.nextInt(65535) + 1;
        System.out.println(r);
        //int sec=12;
        if ((r%100>20)||(r%100<10)) 
            {
            if ((r%10==0) ||(r%10>4)) {System.out.println(r+" рублей");}
                 else {if (r%10==1) {System.out.println(r+" рубль");}
                          else {System.out.println(r+" рубля");};
                      };
            }  
            else {System.out.println(r+" рублей");} ;
        
        }
    }