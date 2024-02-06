public class JapaniseHen implements Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 23;
    }

    @Override
    public String getDescription() {
        return "Японская курица сносит " + getCountOfEggsPerMonth() + " яиц";
    }
}
