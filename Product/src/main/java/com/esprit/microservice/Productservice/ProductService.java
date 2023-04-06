package com.esprit.microservice.Productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	public Product updateProduct(int id, Product newProduct) {
		if (productRepository.findById(id).isPresent()) {
			Product existingProduct = productRepository.findById(id).get();
			existingProduct.setName(newProduct.getName());
			existingProduct.setPrice(newProduct.getPrice());
			existingProduct.setDescription(newProduct.getDescription());

			return productRepository.save(existingProduct);
		} else
			return null;
	}
	public String deleteProduct(int id) {
		if (productRepository.findById(id).isPresent()) {
			productRepository.deleteById(id);
			return "Product supprimé";
		} else
			return "Product non supprimé";
	}
}
