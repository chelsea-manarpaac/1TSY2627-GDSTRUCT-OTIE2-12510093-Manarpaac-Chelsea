public class Main
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(12);
        tree.insert(10);
        tree.insert(34);
        tree.insert(54);
        tree.insert(58);
        tree.insert(23);
        tree.insert(64);
        tree.insert(32);

        System.out.println("Minimum value: " + tree.getMin());
        System.out.println("Maximum value: " + tree.getMax());

        System.out.println("\nDescending Order:");
        tree.traverseInOrderDescending();
    }
}