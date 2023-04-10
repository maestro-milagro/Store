import java.util.List;
//Single-responsibility principle применяется, чтобы разделить
//обязанности работы программы между несколькими классами.
//Как в данном случае я вынес логику по созданию и заполнению
// продуктовой корзины из ProductStore в отдельный класс Bag
public class Bag {
    protected ProductStore store;
    protected List<String> nameInBag;
    protected List<Double> priseInBag;

    public Bag(ProductStore store, List<String> nameInBag, List<Double> priseInBag){
        this.store = store;
        this.nameInBag = nameInBag;
        this.priseInBag = priseInBag;
    }

    public void setStore(ProductStore store) {
        this.store = store;
    }

    public void addInBag(String nameOfProd, int quantity){
        int count = 0;
        for(int i = 0; i<store.name.size(); i++){
            if(store.name.get(i).equals(nameOfProd)){
                while (count!=quantity) {
                    nameInBag.add(store.name.get(i));
                    priseInBag.add(store.prise.get(i));
                    count++;
                }
                return;
            }
        }
    }

    public void removeFromBag(String nameOfProd, int quantity){
        int count = 0;
        while (count!=quantity) {
            nameInBag.remove(nameOfProd);
            priseInBag.remove(nameInBag.indexOf(nameOfProd));
            count++;
        }
    }

    public void showAssortment(){
        System.out.println("Ваша корзина:");
        double overall = 0;
        for(int i = 0; i<nameInBag.size();i++){
            System.out.println(String.format("%s - %s руб", nameInBag.get(i),priseInBag.get(i)));
            overall += priseInBag.get(i);
        }
        System.out.println("Итого : "+ overall+" руб");
    }

}
