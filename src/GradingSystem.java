import java.util.List;
//Dependency inversion principle применяется для того чтобы можно было варьировать реализации кода в зависимости от надобности
//в моём случае я специально вынес логику выставления оценок в интерфейс который можно будет использовать в других областях
//кода(например при проектировании логики выставления оценок службе доставки).
public interface GradingSystem {
    void rate(int impute, String nameOfProd);
    void showRate();
}
