import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductStore store = new ProductStore(new ArrayList<>(),new ArrayList<>());
        store.addProduct("sad",23.4);
        store.addProduct("sed",23.4);
        store.addProduct("sid",23.4);
        store.addProduct("sjd",23.4);
        store.showAssortment();

        Bag bag = new Bag(store, new ArrayList<>(), new ArrayList<>());
        bag.addInBag("sad", 2);
        bag.addInBag("sjd", 3);
        bag.showAssortment();
        System.out.println();

        store.fillList();
        store.rate(6, "sad");
        store.showRate();


    }
}
