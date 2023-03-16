package lol.homestead.homeapp.service;

import lol.homestead.homeapp.model.ShoppingItem;
import lol.homestead.homeapp.repository.ShoppingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ShoppingService {

    @Autowired
    private ShoppingItemRepository repo;

    //put
    public ShoppingItem saveShoppingItem(ShoppingItem shoppingItem) {
        return repo.save(shoppingItem);
    }
    //get
    public List<ShoppingItem> getShoppingItems() {
        return repo.findAll();
    }
    //del
    public String delShoppingItem(int id) {
        repo.deleteById(id);
        return "deleted "+id;
    }
    //up ... not sure how controller passes whole SI object. it must pass an object from the input. !
    public ShoppingItem updateShoppingItem(ShoppingItem shoppingItem) {
        ShoppingItem currentItem = repo.findById(shoppingItem.getId()).orElse(null);
        currentItem.setItemName(shoppingItem.getItemName());
        currentItem.setUser(shoppingItem.getUser());
        currentItem.setShopName((shoppingItem.getShopName()));
        return repo.save(currentItem);
    }
}
