package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "carts")
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{

    @ManyToMany
    @JoinTable(name = "car_item_rel")
    private List<Item>itemList;
}