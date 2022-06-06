class Addition
{
   int x, y;
   Addition()
   {
       x=10; 
       y=20;
   }
     Addition(int a, int b)
    {
         x=a;
         y=b;
    }

}
       public class Lab7
    {
     public static void main(String args[])
       {
         Addition P =new Addition();
         Addition q =new Addition(40,50);
         System.out.println(P.x + P.y);
         System.out.println(q.x +q.y);
       }
    }