package main.com.adventure.player;
import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;

    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Add an item to the end of the backpack array and only if there's enough room in the backpack.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {

        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if  (items[i] != null && items[i].getName().equals(name)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack and removes it if it is.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete the function
        //Tangible[] newItems = new Tangible[items.length];
        //int rmvIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equalsIgnoreCase(item.getName())) {
                items[i] = null;
                return true;
                //rmvIndex = i;
            }
        }
        /*if (rmvIndex > -1) {
            for (int i = 0, k = 0; i < items.length; i++) {
                // check if index is matched, continue without copying
                if (i == rmvIndex) {
                    continue;
                } else {
                    // else copy the element
                    newItems[k++] = items[i];
                }
            }
            System.arraycopy(newItems, 0, items, 0, items.length);
        }*/
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
        System.out.println("Here are the items in your backpack:");
        //for (int i=0;i < items.length; i++) {
        for (Tangible item : items) {
            //System.out.println("- " + items[i].getName());
            System.out.println("- " + item);
        }
    }
}
