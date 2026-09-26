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

        System.out.println("Before Bubble Sort");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+ " ");
        }

        //Bubble Sort O(n^2)
        for (int lastSortedIndex = num.length - 1;
             lastSortedIndex > 0;
             lastSortedIndex--)
        {
            //i = current index
            for(int i = 0; i < lastSortedIndex; i++)
            {
                int rightNum = num[i+1];
                int leftNum = num[i];

                if(leftNum < rightNum)
                {
                    num[i] = rightNum;
                    num[i+1] = leftNum;
                }
            }
        }
        System.out.println("\nAfter Bubble Sort");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+ " ");
        }
    }
}