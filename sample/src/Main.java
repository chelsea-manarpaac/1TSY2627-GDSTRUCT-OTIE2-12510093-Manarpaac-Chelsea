import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        numbers[0] = 400;
        numbers[1] = 90;
        numbers[2] = 80;
        numbers[3] = 70;
        numbers[4] = 50;
        numbers[5] = 9;
        numbers[6] = 80;
        numbers[7] = 45;
        numbers[8] = 55;
        numbers[9] = -73;

        System.out.println("Before Bubble Sort");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+ " ");
        }

        //BubbleSort O(n^2)
        for (int lastSortedIndex = numbers.length - 1;
             lastSortedIndex > 0;
             lastSortedIndex--)
        {
            //i = current index
            for(int i = 0; i < lastSortedIndex; i++)
            {
                int leftNum = numbers[i];
                int rightNum = numbers[i+1];

                if(leftNum > rightNum)
                {
                    numbers[i] = rightNum;
                    numbers[i+1] = leftNum;
                }
            }
        }
        System.out.println("\nAfter Bubble Sort");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+ " ");
        }
    }
}