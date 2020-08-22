package br.com.ctrlabs.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ctrlabs.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
