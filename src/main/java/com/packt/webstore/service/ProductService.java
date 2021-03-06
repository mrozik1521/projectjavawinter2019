package com.packt.webstore.service;

import com.packt.webstore.domain.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;


public interface ProductService {
	List <Product> getAllProducts();
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
	Set<Product> getproductsByFilter(Map<String, List<String>> filterParams);
	List<Product> getProductsByManufacturer(String manufacturer);
	Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterPriceParams);
	void addProduct(Product product);
}
