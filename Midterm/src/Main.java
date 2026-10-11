import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        CardStack playerHand = new CardStack(30);
        CardStack playerDeck = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        playerDeck.push(new Card(1, "Jimbo"));
        playerDeck.push(new Card(2, "Even Steven"));
        playerDeck.push(new Card(3, "Odd Todd"));
        playerDeck.push(new Card(4, "Brainstorm"));
        playerDeck.push(new Card(5, "Blueprint"));
        playerDeck.push(new Card(6, "Egg"));
        playerDeck.push(new Card(7, "Space Joker"));
        playerDeck.push(new Card(8, "Perkeo"));
        playerDeck.push(new Card(9, "Canio"));
        playerDeck.push(new Card(10, "Triboulet"));
        playerDeck.push(new Card(11, "Yorick"));
        playerDeck.push(new Card(12, "Chicot"));
        playerDeck.push(new Card(13, "Baron Joker"));
        playerDeck.push(new Card(14, "Greedy Joker"));
        playerDeck.push(new Card(15, "Lusty Joker"));
        playerDeck.push(new Card(16, "Wrathful Joker"));
        playerDeck.push(new Card(17, "Gluttonous Joker"));
        playerDeck.push(new Card(18, "Joker Stencil"));
        playerDeck.push(new Card(19, "Mime"));
        playerDeck.push(new Card(20, "Abstract Joker"));
        playerDeck.push(new Card(21, "Gros Michel"));
        playerDeck.push(new Card(22, "Faceless Joker"));
        playerDeck.push(new Card(23, "Green Joker"));
        playerDeck.push(new Card(24, "Cavendish"));
        playerDeck.push(new Card(25, "Square Joker"));
        playerDeck.push(new Card(26, "Madness"));
        playerDeck.push(new Card(27, "Riff Raff"));
        playerDeck.push(new Card(28, "Vagabond"));
        playerDeck.push(new Card(29, "Sock and Buskin"));
        playerDeck.push(new Card(30, "Invisible Joker"));

        CardStack temp = new CardStack(30); // copying playerDeck to playerHand
        while (!playerDeck.isEmpty())
        {
            Card card = playerDeck.pop();

            playerHand.push(card);
            temp.push(card);
        }
        while (!temp.isEmpty())
        {
            playerDeck.push(temp.pop());
        }

        System.out.println("Current hand [" + playerHand.size() + "]:");
        playerHand.printStack();
        while(!playerHand.isEmpty())
        {
            int num = rand.nextInt(3);
            int cards = rand.nextInt(5)+1;
            int discard = rand.nextInt(6)+5;

            if(num == 1) // drawing cards from deck
            {
                System.out.println("\nDraw " + cards + " cards.");

                for (int i = cards; i > 0 && !playerDeck.isEmpty(); i--)
                {
                    Card drawnCard = playerDeck.pop();
                    playerHand.push(drawnCard);

                    System.out.println("You drew... " + drawnCard + '!');
                }
            }
            else if(num == 2) // discarding cards from hand
            {
               System.out.println("\nDiscard " + discard + " cards.");
                for(int i = discard; i > 0 && !playerHand.isEmpty(); i--)
                {
                    Card discardedCard = playerHand.pop();
                    discardPile.push(discardedCard);

                    System.out.println("You discarded... " + discardedCard);
                }
            }
            else // drawing cards from discard pile
            {
                System.out.println("\nGet " + cards + " from the discarded pile.");
                if(discardPile.isEmpty())
                {
                    System.out.println("Whoops. There's no more cards in the discarded pile.\n");
                }
                else
                {
                    for(int i = cards; i > 0 && !discardPile.isEmpty(); i--)
                    {
                        Card drawnCard = discardPile.pop();
                        playerHand.push(drawnCard);

                        System.out.println("You retrieved... " + drawnCard + '!');
                    }
                }
            }
            if(!playerHand.isEmpty())
            {
                System.out.println("\nCurrent hand [" + playerHand.size() + "]:");
                playerHand.printStack();
                System.out.println("\nPress Enter to continue...");
                input.nextLine();
            }
        }
        System.out.println("\nYou don't have any more cards in your hand!");
    }
}