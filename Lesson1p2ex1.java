public class Lesson1p2ex1 
    {public static void main(String[] args)
        {int f=1;
        for (int i=1;i<=16; i++) 
            {
            f=f*i; 
            if (i<10) {continue;}; //значения до 10 не выводить
            System.out.println(f);
            }
        }
    }