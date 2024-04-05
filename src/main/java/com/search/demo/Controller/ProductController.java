package com.search.demo.Controller;

import com.search.demo.entity.Product;
import com.search.demo.pojo.SearchProductApiData;
import com.search.demo.repositroy.ProductsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired ProductsRepository productsRepository;
    @Transactional
    @PostMapping("api/search")
    public ResponseEntity<List<Product>> SearchProducts(@RequestBody SearchProductApiData apiData){
        List<Product>productList=productsRepository.dbSearchProducts(apiData.getSearchText());
        return  new ResponseEntity<>(productList, HttpStatus.OK);

    }
}
