package com.search.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@Table(name = "products")
public class Product {
    @Id
    public int Product_Id;
    public String title;
    public String Description;
    public float price;
    public String thumbnail_path;
    public int no_of_reviews;
    public int in_stock;
}
