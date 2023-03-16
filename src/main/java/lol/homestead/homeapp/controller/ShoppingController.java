package lol.homestead.homeapp.controller;

import lol.homestead.homeapp.model.ShoppingItem;
import lol.homestead.homeapp.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    private ShoppingService serv;

    @PostMapping("/addItem")
    public ShoppingItem addSI(@RequestBody ShoppingItem shoppingItem) {
        return serv.saveShoppingItem(shoppingItem);
    }
    @GetMapping("/showList")
    public List<ShoppingItem> findAllShoppingItems() {
        return serv.getShoppingItems();
    }
    @DeleteMapping("/delete/{id}")
    public String delShoppingItem(@PathVariable int id)  {
        return serv.delShoppingItem(id);
    }
    @PutMapping("/update")
    public ShoppingItem updateShoppingItem(@RequestBody ShoppingItem shoppingItem) {
        return serv.updateShoppingItem(shoppingItem);
    }

}
