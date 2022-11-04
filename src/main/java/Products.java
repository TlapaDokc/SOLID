import java.util.HashMap;
import java.util.Map;

public class Products {
    protected HashMap<String, Integer> products = new HashMap<>();

    public Products() {
        this.products.put("Хлеб", 56);
        this.products.put("Масло", 153);
        this.products.put("Колбаса", 211);
        this.products.put("Пирожок", 45);
    }

    public void setProduct(String product, int count) {
        this.products.put(product, count);
    }

    public void removeProduct(String product) {
        this.products.remove(product);
    }

    public int getSize() {
        return this.products.size();
    }

    public int getPrice(String product) {
        return this.products.get(product);
    }

    public void printProductsAndPrices() {
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
