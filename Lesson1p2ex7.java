import java.util.Random;
public class Lesson1p2ex7 
    {public static void main(String[] args)
        {
        Random random = new Random();
        int alen=random.nextInt(10) + 1;
        int hlen=alen/2+alen%2;
        int[][] arr=new int[alen][alen];
        for (int i=0; i<hlen; i++)
            { 
            for (int j=i; j<hlen;j++)
                {
                arr[i][j]=1;
                arr[alen-1-i][j]=1;
                arr[alen-1-i][alen-1-j]=1;
                arr[i][alen-1-j]=1;
                };
            }
        for (int i=0; i<alen; i++)
            { 
            for (int j=0; j<alen;j++){System.out.print(arr[i][j]+" ");};
            System.out.println();
            }
        }
    }