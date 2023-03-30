package com.pellin.api;

import com.pellin.api.Model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        Product product = new Product();
        product.setName("Coca Cola");
        product.setPrice(1.5f);
        try {
            FileOutputStream fileOut = new FileOutputStream("serializable.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in serializable.ser");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        product = null;
        try {
            FileInputStream fileIn = new FileInputStream("serializable.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            product = (Product) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Deserialized Product...");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
