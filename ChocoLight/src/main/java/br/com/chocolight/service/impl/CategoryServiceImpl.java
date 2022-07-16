package br.com.chocolight.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chocolight.model.Category;
import br.com.chocolight.repository.CategoryRepository;
import br.com.chocolight.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void delete(Category category) {
		categoryRepository.delete(category);
	}

	@Override
	public Category getById(Long id) {
		return categoryRepository.findById(id).get();
	}

	
	
}
