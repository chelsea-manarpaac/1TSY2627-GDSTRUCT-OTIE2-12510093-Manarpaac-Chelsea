import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        Queue<String> queue = new Queue<>();

        int playerNum = 1;
        int games = 0;

        while(games < 10)
        {
            System.out.println("\nPress ENTER to add players...");
            scanner.nextLine();

            int x = rand.nextInt(7)+1;
            System.out.println("Players joining this turn: " + x);

            for(int i = 0; i < x; i++)
            {
                String player = "Player " + playerNum;
                queue.enqueue(player);

                System.out.println(player + " joined the queue.");
                playerNum++;
            }

            while (queue.size() >= 5 && games < 10)
            {
                games++;
                System.out.println("\n=== GAME " + games + " STARTED ===");

                for (int i = 0; i < 5; i++)
                {
                    String player = queue.dequeue();
                    System.out.println(player + " matched!");
                }
                System.out.println("Game successfully made!");
            }
            System.out.println("Players waiting: " + queue.size());
        }
        System.out.println("\n10 games were created!");
        scanner.close();
    }
}