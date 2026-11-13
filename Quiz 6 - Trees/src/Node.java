public class Node
{
    private int data;
    private Node leftChild;
    private Node rightChild;

    public void insert(int value)
    {
        if(value == data) //duplicate value
        {
            return;
        }

        if(value < data) // left child
        {
            if(leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else // right child
        {
            if(rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder()
    {
        if(leftChild != null)
        {
            leftChild.traverseInOrder();
        }

        System.out.println("Data: " + data);

        if(rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    // descending order
    public void traverseInOrderDescending()
    {
        if(rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }

        System.out.println("Data: " + data);

        if(leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }

    // gets node with smallest value
    public Node getMin()
    {
        if(leftChild == null)
        {
            return this;
        }

        return leftChild.getMin();
    }

    // gets node with largest value
    public Node getMax()
    {
        if(rightChild == null)
        {
            return this;
        }

        return rightChild.getMax();
    }

    public Node get(int value)
    {
        if(value == data)
        {
            return this;
        }

        if(value < data)
        {
            if(leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if(rightChild != null)
            {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public Node(int _data) {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
