public class Main
{
    public static void main(String[] args)
    {
        int number = 1;
        int sum = 0;

        while (number <= 10)
        {
            sum = sum + number;
            number++;
        }

        System.out.println("Sum = " + sum);
    }
}
