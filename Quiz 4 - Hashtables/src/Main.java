public class Main
{
    public static void main(String[] args)
    {
        Player ploo = new Player(  134,  "Plooful",  135);          //7 --
        Player wardell = new Player(  536,  "TSM WardelL",  640);   //11
        Player deadlyJimmy = new Player(  32,  "DeadlyJimmy",  34); //11
        Player subroza = new Player(  4931,  "Subroza",  604);      //7 --
        Player annieDro = new Player(  6919,  "C9 Annie",  593);    //8

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getName(), ploo);
        hashtable.put(wardell.getName(), wardell);
        hashtable.put(deadlyJimmy.getName(), deadlyJimmy);
        hashtable.put(subroza.getName(), subroza);
        hashtable.put(annieDro.getName(), annieDro);

        hashtable.printHashTable();
        System.out.println(hashtable.get("C9 Annie"));

        hashtable.remove("Plooful");
        System.out.println("Updated Hashtable:\n");
        hashtable.printHashTable();
    }
}