package com.search.demo.repositroy;

import com.search.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product,Integer> {
    @Procedure(procedureName = "products_search")
    List<Product> dbSearchProducts(@Param("search_text") String searchText);

}
