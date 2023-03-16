package lol.homestead.homeapp.repository;

import lol.homestead.homeapp.model.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Integer> {



}
