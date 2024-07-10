public class Main {
    public static void main(String[] args) {
        
        HashTable myHashTable = new HashTable();

        // myHashTable.printtable();

        myHashTable.set("nails", 1000);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);


        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        // myHashTable.printtable();

        // System.out.println("Value for Tile: " +myHashTable.get("tile"));
        // System.out.println("Value for Nuts: " +myHashTable.get("nuts"));

        System.out.println(myHashTable.keys());        
    }
}
