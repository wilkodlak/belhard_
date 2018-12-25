import java.util.Random;
public class Lesson1p2ex5 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int maxarr=0;
        int maxpos=-1;
        int[] arr=new int[random.nextInt(20) + 1];
        for (int i=0; i<arr.length; i++)
            {arr[i]=random.nextInt(10) + 1;};
        for (int i=0; i<arr.length; i++)
            { System.out.print(arr[i]+"  ");};
        System.out.println();

        for (int  i=0; i<arr.length/2; i++)
            { 
            int a=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=a;
            };
        for (int i=0; i<arr.length; i++)
            { System.out.print(arr[i]+"  ");};
        System.out.println();

        }
    }