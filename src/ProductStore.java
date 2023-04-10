import java.util.ArrayList;
import java.util.List;

public class ProductStore extends Store implements GradingSystem {

    protected List<String> name;
    protected List<Double> prise;
    protected List<Integer> rateList = new ArrayList<>();
    public ProductStore(List<String> name,List<Double> prise){
        this.name = name;
        this.prise = prise;
    }
    //Один из явных случаев избегания магических чисел в коде, когда мы, вместо того чтобы задать
    //конкретное число для списка продуктов и от него отталкиваться во время прохода циклом, просто
    // заполняем его по мере надобности и берем цикл от размера списка
    public void showAssortment(){
        for(int i = 0; i<name.size();i++){
            System.out.println(String.format("%s - %s руб", name.get(i),prise.get(i)));
        }
    }

    public void setAssortment(List<String> name,List<Double> prise) {
        this.name = name;
        this.prise = prise;
    }
    //Правило DRY применяется всякий раз когда мы создаём метод для какой-либо периодически применяемой
    //операции по типу добавления нового товара в список
    public void addProduct(String nameOfElement, double priseOfElement){
        name.add(nameOfElement);
        prise.add(priseOfElement);
    }

    @Override
    public void rate(int impute, String nameOfProd) {
        rateList.set(name.indexOf(nameOfProd),impute);

    }
    @Override
    public void showRate() {
        System.out.println("Рейтинг продуктов по 10-ти балльной шкале:");
        for(int i = 0; i<name.size();i++){
            System.out.println(String.format("%s - %s", name.get(i),rateList.get(i)));
        }

    }

    public void fillList(){
        for (String s: name){
            rateList.add(0);
        }
    }
}
