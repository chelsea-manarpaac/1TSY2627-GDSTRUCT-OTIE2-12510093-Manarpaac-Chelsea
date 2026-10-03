public class Main {
    public static void main(String[] args) {
        PlayerLinkList playerLinkList = new PlayerLinkList();

        playerLinkList.addToFront(new Player(1, "SpiderMan", 100));
        playerLinkList.addToFront(new Player(2, "IronMan", 150));
        playerLinkList.addToFront(new Player(3, "Thor", 120));
        playerLinkList.printLinkedList();

        //testing size
        System.out.println("\nList Size: " + playerLinkList.size());

        //testing constrain
        Player ironMan = new Player(2, "IronMan", 150);
        System.out.println("Contains IronMan: " + playerLinkList.contains(ironMan));

        //testing index
        System.out.println("Index of IronMan: " + playerLinkList.indexOf(ironMan));

        //removing first element in the list
        playerLinkList.removeFirst();
        System.out.println("\nRemoved first element");
        playerLinkList.printLinkedList();
        System.out.println("\nUpdated List Size: " + playerLinkList.size());
    }
}