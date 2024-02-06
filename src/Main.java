import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну. У вас на выбор: Россия / Япония / Беларусь");
        String nation = scanner.next();
        System.out.println(factory.getHen(nation).getDescription());
    }
}
