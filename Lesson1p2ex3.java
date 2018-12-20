// достаточно было взять сумму первых n чисел, умножннную на 3. 3*(N(N+1))/2, где N - наибольшее число ряда
import java.util.Random;
public class Lesson1p2ex3 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int n=random.nextInt(100) + 1;
        int dev=0;
        int nsum=0;
        int i=1;
        System.out.println(n);
        while (dev<n)
           {
           if (i%3==0) 
              {
              nsum=nsum+i;
              dev++;
              }
           i++;
           }
        System.out.println(nsum+ " проверка "+ 3*(n*(n+1))/2);
        }
    }