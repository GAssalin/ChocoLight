package br.com.chocolight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocolight.model.Category;
import br.com.chocolight.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping("/getAll")
	public List<Category> getAll() {
		return service.getAll();
	}
	
	@PostMapping("/save")
	public Category save(@RequestBody Category Category) {
		return service.save(Category);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Category product) {
		service.delete(product);
	}
	
}
