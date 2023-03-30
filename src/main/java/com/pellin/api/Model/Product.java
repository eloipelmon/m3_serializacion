package com.pellin.api.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements java.io.Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private float price;

}
