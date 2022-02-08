package day04.solution;

import java.time.LocalDate;

public class Service extends WebShopItem {

    public static final int DEFAULT_EXPIRATION = 1;

    public Service(String name, int price) {
        super(name, price);
    }

    @Override
    public WebShopItem webShopItemCopy() {
        Service service = new Service(getName(),getPrice());
        service.setExpirationDate(LocalDate.now().minusYears(DEFAULT_EXPIRATION));

        return service;
    }


}
