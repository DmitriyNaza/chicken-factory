public class RussianHen implements Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Русская курица сносит " + getCountOfEggsPerMonth() + " яиц";
    }
}
