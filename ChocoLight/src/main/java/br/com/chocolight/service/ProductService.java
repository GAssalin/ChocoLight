package br.com.chocolight.service;

import java.util.List;

import br.com.chocolight.model.Product;

public interface ProductService {

	public List<Product> getAll();
	public Product save(Product product);
	public void delete(Product product);
	
}
