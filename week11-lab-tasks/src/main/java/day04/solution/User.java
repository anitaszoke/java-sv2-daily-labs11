package day04.solution;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int money;
    private List<WebShopItem> items = new ArrayList<>();

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<WebShopItem> getItems() {
        return items;
    }

    public void addItems(WebShopItem item) {
        if (item instanceof Product && money>= 3 * item.getPrice()) {
            ((Product) item).addPlusGuarantee(3);
            money -= item.getPrice()*1.1;
        }
        money-= item.getPrice();
        items.add(item);
    }
}
