public class PlayerLinkList
{
    private PlayerNode head;
    private int size = 0;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    //removes first element
    public void removeFirst()
    {
        if (head != null)
        {
            head = head.getNextPlayer();
            size--;
        }
    }

    //returns number of elements
    public int size()
    {
        return size;
    }

    //checks if list contains player
    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    //index of player
    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }

            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }

    public void printLinkedList()
    {
        PlayerNode current = head;
        System.out.print("Head -> ");

        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.print(" null ");
    }
}