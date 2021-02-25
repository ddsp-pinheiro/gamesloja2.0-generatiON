package com.newgamesloja.newgenerationgames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newgamesloja.newgenerationgames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {	
		public List<Categoria> findAllByNomeContainingIgnoreCase (String nome); 

}