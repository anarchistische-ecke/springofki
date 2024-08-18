package pro.sky.springy.Service;

import org.springframework.stereotype.Service;
import pro.sky.springy.ShoppingCart;

import java.util.List;

@Service
public class CartService {
    private final ShoppingCart shoppingCart;

    public CartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(List<Long> cart) {
        shoppingCart.add(cart);
    }

    public List<Long> get() {
        return shoppingCart.get();
    }

}
