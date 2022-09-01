package br.com.mecone.gestor.produto.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mecone.gestor.produto.domain.Produto;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID>{
	Optional <Produto> findByCodigo (int codigo);
}
