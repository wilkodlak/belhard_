public class Lesson1ex1 
    {public static void main(String[] args)
        {int sec=4500;
        System.out.println(sec/60+ " "+ sec%60);
        System.out.println(sec/3600+" "+(sec/60)%60+ " "+ sec%60);
        System.out.println((sec/3600)/24+" "+(sec/3600)%24+" "+(sec/60)%60+ " "+ sec%60);
        System.out.println(((sec/3600)/24)/7+" "+((sec/3600)/24)%7+" "+(sec/3600)%24+" "+(sec/60)%60+ " "+ sec%60);

        }
    }