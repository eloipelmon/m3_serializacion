
package com.pellin.api.Repository;

import com.pellin.api.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryOfProducts extends JpaRepository<Product, Integer> {
    
}
