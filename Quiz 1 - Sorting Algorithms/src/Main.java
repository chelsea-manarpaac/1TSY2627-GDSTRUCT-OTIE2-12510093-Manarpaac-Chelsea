import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[] num = new int[10];
        num[0] = 400;
        num[1] = 90;
        num[2] = 80;
        num[3] = 70;
        num[4] = 50;
        num[5] = 9;
        num[6] = 80;
        num[7] = 45;
        num[8] = 55;
        num[9] = -73;

        System.out.println("Before Selection Sort");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+ " ");
        }

        //SelectionSort O(n^2)
        for(int curIdx = 0; curIdx < num.length; curIdx++)
        {
            int smallestIndex = curIdx;

            for (int searchIdx = curIdx + 1;
                 searchIdx<num.length;
                 searchIdx++)
            {
                if(num[searchIdx] > num[smallestIndex])
                {
                    smallestIndex = searchIdx;
                }
            }

            //swapping
            int smallestNumber = num[smallestIndex];
            num[smallestIndex] = num[curIdx];
            num[curIdx] = smallestNumber;
        }
        System.out.println("\nAfter Selection Sort");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+ " ");
        }
    }
}