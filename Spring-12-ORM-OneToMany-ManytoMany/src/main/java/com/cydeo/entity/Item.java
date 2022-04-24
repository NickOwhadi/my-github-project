package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Item extends BaseEntity{
    private String name;
    private String Code;
    @ManyToMany(mappedBy ="itemList")
    private List<Cart> cartList;

    public Item(String name, String code) {
        this.name = name;
        Code = code;
    }
}
