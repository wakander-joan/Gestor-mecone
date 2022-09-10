package br.com.mecone.gestor.produto.api.repository;

import java.util.List;
import java.util.UUID;

import br.com.mecone.gestor.produto.domain.Produto;

public interface ProdutoRepository {
	Produto salva(Produto produto);
	Produto buscaProdutoPorCodigo(int codigo);
	List<Produto> getTodosProdutos(UUID idEmpresa);
}
