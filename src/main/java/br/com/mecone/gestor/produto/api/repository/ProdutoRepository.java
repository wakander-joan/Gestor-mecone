package br.com.mecone.gestor.produto.api.repository;

import java.util.List;

import br.com.mecone.gestor.produto.api.application.ProdutoListResponse;
import br.com.mecone.gestor.produto.domain.Produto;

public interface ProdutoRepository {
	Produto salva(Produto produto);
	List<Produto> getTodosProdutos();
	Produto buscaProdutoPorCodigo(int codigo);
}
