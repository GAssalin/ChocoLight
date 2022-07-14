package br.com.chocolight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.chocolight.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
