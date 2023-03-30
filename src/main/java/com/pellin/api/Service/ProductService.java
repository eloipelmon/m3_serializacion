package com.pellin.api.Service;

import com.pellin.api.Model.Product;
import com.pellin.api.Repository.RepositoryOfProducts;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired

    private RepositoryOfProducts repository;

    public List<Product> listProducts() {
        return repository.findAll();
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public Product obtenerProductById(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }
}
