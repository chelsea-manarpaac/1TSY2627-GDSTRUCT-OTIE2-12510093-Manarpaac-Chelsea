public class SimpleHashtable
{
    private Player[] hashtable;

    public SimpleHashtable()
    {
        hashtable = new Player[10];
    }
    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }
    public void put(String key, Player player)
    {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] == null)
        {
            hashtable[hashedKey] = player;
        }
        else
        {
            System.out.println("Sorry the element in this position is already occupied");
        }
    }
    public Player get(String key)
    {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    public void printHashTable()
    {
        for(int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element in : " + i + " : " + hashtable[i]);
        }
    }
    public void remove(String key)
    {
        int hashedKey = hashKey(key);

        while(hashtable[hashedKey] != null)
        {
            if (hashtable[hashedKey].getName().equals(key))
            {
                hashtable[hashedKey] = null;
                System.out.println(key + " has been removed.");
                return;
            }
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        System.out.println(key + " does not exist."); // if the key was already removed or non-existent
    }
}