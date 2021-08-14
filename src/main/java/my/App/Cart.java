
package my.App;

import java.util.ArrayList;

public class Cart {
    // creates an ArrayList of type Item to manipulate cart items
    ArrayList<Item> cartList = new ArrayList<>();

    // add an Item on the list
    public void add(Item item) {
        cartList.add(item);
    }

    // removes an Item from the list
    public void remove(Item item) {
        cartList.remove(item);
    }

    // returns the size of the list
    public int size() {
        return cartList.size();
    }

    // returns the total price of all items in the list
    public double getTotal() {
        double total = 0.0;

        for (int i = 0; i < cartList.size(); i++) {
            total += cartList.get(i).itemPrice * cartList.get(i).itemQuantity;
        }

        return total;
    }

    // prints the names of the items in the list
    public void print(int index) {
        System.out.println(cartList.get(index).itemName);
    }

    // returns the price of an item in the list
    public String getName(int index) {
        return cartList.get(index).itemName;
    }

    // returns the price of an item in the list
    public double getPrice(int index) {
        return cartList.get(index).itemPrice;
    }

    // returns the quantity of an item in the list
    public int getQuantity(int index) {
        return cartList.get(index).itemQuantity;
    }

    // update the quantity of an item in the list
    public void setQuantity(int index, int quantity) {
        cartList.get(index).itemQuantity = quantity;
    }
}
