import java.util.Map;

public class Basket {
    protected Purchase[] purchases;

    public Basket(int productsCount) {
        this.purchases = new Purchase[productsCount];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Products products) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * products.getPrice(purchase.title)) + " руб.");
            sum += purchase.count * products.getPrice(purchase.title);
        }
        return sum;
    }
}
