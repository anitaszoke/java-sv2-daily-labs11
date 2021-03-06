package day04.solution;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<WebShopItem> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addItem(WebShopItem item) {
        items.add(item);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void buy(String userName, String itemName) {
        User user = searchForUser(itemName);
        WebShopItem item = searchForItem(itemName);

        if (user.getMoney()>=item.getPrice()) {
            user.addItems(item.webShopItemCopy());
        }
    }

    private WebShopItem searchForItem(String itemName) {
        for (WebShopItem i : items) {
            if (itemName.equals(i.getName())) {
                return i;
            }
        }
        throw new IllegalArgumentException("Cannot find item");

    }

    private User searchForUser(String userName) {
        for (User u : users) {
            if (userName.equals(u.getName()));
            return u;
        }
        throw new IllegalArgumentException("Cannot find user");
    }
}
