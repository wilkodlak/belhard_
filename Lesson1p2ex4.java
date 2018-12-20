import java.util.Random;
public class Lesson1p2ex4 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int maxarr=0;
        int maxpos=-1;
        int[] arr=new int[random.nextInt(100) + 1];
        for (int i=0; i<arr.length; i++)
            {arr[i]=random.nextInt(10) + 1;};
        for (int i=0; i<arr.length; i++)
            {
            if (arr[i]>maxarr)
                {
                maxarr=arr[i];
                maxpos=i;
                };
            };
        System.out.println("максимальная "+maxarr+ " позиция " +maxpos);

        System.out.println("первая "+arr[0]+ " последняя "+arr[arr.length-1]);
        }
    }