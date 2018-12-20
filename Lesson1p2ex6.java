import java.util.Random;
public class Lesson1p2ex6 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int bsum=0;
        int[] arr=new int[random.nextInt(40) + 1];
        for (int i=0; i<arr.length; i++)
            {arr[i]=random.nextInt(10) + 1;};
        int maxarr=arr[0];
        int maxpos=0;
        int minarr=arr[0];
        int minpos=0;
        for (int i=0; i<arr.length; i++)
            { 
            if (arr[i]>maxarr)
                {
                maxarr=arr[i];
                maxpos=i;
                };
            if (arr[i]<minarr)
                {
                minarr=arr[i];
                minpos=i;
                };
            };
        
        for (int i=0; i<arr.length; i++)
            { System.out.print(arr[i]+"  ");};
        System.out.println();

        System.out.println(minpos+" "+ arr[minpos]+ " "+maxpos+" "+arr[maxpos]);

        if (minpos<maxpos)
            {
            for (int  i=minpos; i<=maxpos; i++) {bsum=bsum+arr[i];};
            }
            else
            {
            for (int  i=maxpos; i<=minpos; i++) {bsum=bsum+arr[i];};
            };

        System.out.println(bsum);

        }
    }