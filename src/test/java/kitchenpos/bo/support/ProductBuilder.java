package kitchenpos.bo.support;

import java.math.BigDecimal;
import kitchenpos.model.Product;

public final class ProductBuilder {

    private Long id;
    private String name;
    private BigDecimal price;

    private ProductBuilder() {
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public ProductBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        return product;
    }
}
