import java.util.Random;
public class Lesson1ex6 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int r=random.nextInt(9000)+1000 ;   //гарантировано  четырехзначное число
//        int r=5555; //проверка на реально совпадающих цифрах, классы эквивалентности. через случайное число получить не смог
        System.out.println(r);

        int i= (r/1000);
        if ((i==((r/10)%10))&&(i==((r/100)%10))&&(i==(r%10))) 
            {System.out.println("равны");}
            else
            {System.out.println("различны");}
        
        }
    }