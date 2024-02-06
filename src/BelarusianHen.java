public class BelarusianHen implements Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 28;
    }

    @Override
    public String getDescription() {
        return "Беларуская курица сносит " + getCountOfEggsPerMonth() + " яиц";
    }
}
