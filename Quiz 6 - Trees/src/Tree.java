public class Tree
{
    private Node root;

    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    // descending order
    public void traverseInOrderDescending()
    {
        if(root != null)
        {
            root.traverseInOrderDescending();
        }
    }

    // gets node with the smallest value
    public Node getMin()
    {
        if(root == null)
        {
            return null;
        }

        return root.getMin();
    }

    // gets node with the largest value
    public Node getMax()
    {
        if(root == null)
        {
            return null;
        }

        return root.getMax();
    }

    public Node get(int value)
    {
        if(root != null)
        {
            return root.get(value);
        }

        return null;
    }
}
