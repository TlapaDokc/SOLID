import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Products products = new Products();

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        products.printProductsAndPrices();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Basket purchase = new Basket(products.getSize());
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum(products);
        System.out.println("ИТОГО: " + sum);
    }
}