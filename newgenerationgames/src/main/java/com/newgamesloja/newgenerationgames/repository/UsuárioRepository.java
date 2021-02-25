package com.newgamesloja.newgenerationgames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newgamesloja.newgenerationgames.model.Usuario;


@Repository
public interface UsuárioRepository extends JpaRepository<Usuario, Long> {	
		public List<Usuario> findAllByNomeContainingIgnoreCase (String nome); 

}