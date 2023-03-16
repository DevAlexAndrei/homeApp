package lol.homestead.homeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

//one model class per table why not?
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SHOPPING_LIST")

public class ShoppingItem {

    @Id
    @GeneratedValue
    private int id;

    private String user;


    private String itemName;
    private String shopName;
    private Boolean satisfied;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Boolean getSatisfied() {
        return satisfied;
    }

    public void setSatisfied(Boolean satisfied) {
        this.satisfied = satisfied;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
