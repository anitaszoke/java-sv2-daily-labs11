package day04.solution;

import java.time.LocalDate;

public class Product extends WebShopItem {

    public static final int GUARANTEE = 3;

    public Product(String name, int price) {
        super(name, price);
    }

    public void addPlusGuarantee(int year) {
        setExpirationDate(LocalDate.now().plusYears(year));
    }

    @Override
    public WebShopItem webShopItemCopy() {
        Product product = new Product(this.getName(), this.getPrice());
        product.setExpirationDate(LocalDate.now().plusMonths(EXPIRE));

        return product;
    }
}
