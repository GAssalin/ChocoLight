package br.com.chocolight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocolight.model.Product;
import br.com.chocolight.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/getAll")
	public List<Product> getAll() {
		return service.getAll();
	}
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return service.save(product);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Product product) {
		service.delete(product);
	}
	
}
