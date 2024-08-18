package pro.sky.springy;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Long> cart = new ArrayList<>();

    public void add(List<Long> shoppingCart) {
        this.cart.addAll(shoppingCart);
    }

    public List<Long> get() {
        return Collections.unmodifiableList(cart);
    }
}
