
package my.App;

import java.util.ArrayList;
import java.util.List;

public class Catalouge {
    // create an ArrayList of type Item
    List<Item> itemList = new ArrayList<>();

    // adds item to the list
    public void add(Item item) {
        itemList.add(item);
    }

    // returns size of the list
    public int size() {
        return itemList.size();
    }

    // returns index of a particular item
    public Item get(int index) {
        return itemList.get(index);
    }

    // prints the name of the item in the list
    public void print(int index) {
        System.out.println(itemList.get(index).itemName);
    }
}
