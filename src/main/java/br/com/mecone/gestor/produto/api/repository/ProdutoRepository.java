package br.com.mecone.gestor.produto.api.repository;

import br.com.mecone.gestor.produto.domain.Produto;

public interface ProdutoRepository {
	Produto salva(Produto produto);
}
