public class LoopApp
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 20; i++)
        {
            // number divisible by 3 and 5
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Apple Orange " + i);
            }
            // number divisible by 3
            else if(i % 3 == 0)
            {
                System.out.println("Apple " + i);
            }
            // number divisible by 5
            else if(i % 5 == 0)
            {
                System.out.println("Orange " + i);
            }
            // number not divisible by 3 or 5
            else
            {
                System.out.println("Looping ... number " + i);
            }
        }
    }
}