package com.generation.farmacia.repository;

import com.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


    List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
    List<Produto> findAllByMarcaContainingIgnoreCase(@Param("marca")String marca);


}
