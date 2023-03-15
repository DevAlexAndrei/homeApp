package lol.homestead.homeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//one model class per table why not?
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SHOPPING_LIST")

public class ShoppingList {

    @Id
    private int id;
    private String itemName;
    private String shopName;


    private Boolean satisfied;
}
