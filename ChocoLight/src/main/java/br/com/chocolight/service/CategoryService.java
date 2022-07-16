package br.com.chocolight.service;

import java.util.List;

import br.com.chocolight.model.Category;

public interface CategoryService {

	public List<Category> getAll();
	public Category save(Category category);
	public void delete(Category category);
	
	public Category getById(Long id);
	
}
