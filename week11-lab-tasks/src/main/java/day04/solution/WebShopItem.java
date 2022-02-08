package day04.solution;

import java.time.LocalDate;

public abstract class WebShopItem {

    public static final int EXPIRE=3;

    private String name;
    private int price;
    private LocalDate expirationDate;

    public WebShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public abstract WebShopItem webShopItemCopy();
}
