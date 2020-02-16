package kitchenpos.bo.support;

import java.math.BigDecimal;
import java.util.List;
import kitchenpos.model.Menu;
import kitchenpos.model.MenuProduct;

public final class MenuBuilder {

    private Long id;
    private String name;
    private BigDecimal price;
    private Long menuGroupId;
    private List<MenuProduct> menuProducts;

    private MenuBuilder() {
    }

    public static MenuBuilder builder() {
        return new MenuBuilder();
    }

    public MenuBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public MenuBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MenuBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public MenuBuilder withMenuGroupId(Long menuGroupId) {
        this.menuGroupId = menuGroupId;
        return this;
    }

    public MenuBuilder withMenuProducts(List<MenuProduct> menuProducts) {
        this.menuProducts = menuProducts;
        return this;
    }

    public Menu build() {
        Menu menu = new Menu();
        menu.setId(id);
        menu.setName(name);
        menu.setPrice(price);
        menu.setMenuGroupId(menuGroupId);
        menu.setMenuProducts(menuProducts);
        return menu;
    }
}
