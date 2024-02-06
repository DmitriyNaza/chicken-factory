public class Factory {
    public Hen getHen(String nation) {
        switch (nation) {
            case "Россия":
                return new RussianHen();
            case "Япония":
                return new JapaniseHen();
            case "Беларусь":
                return new BelarusianHen();
            default:
                System.out.println("Нет такой курицы");
                break;
        }
        return null;
    }

}
