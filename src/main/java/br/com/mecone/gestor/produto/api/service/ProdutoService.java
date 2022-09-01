package br.com.mecone.gestor.produto.api.service;

import java.util.List;

import javax.validation.Valid;

import br.com.mecone.gestor.produto.api.application.ProdutoListResponse;
import br.com.mecone.gestor.produto.api.application.ProdutoRequest;
import br.com.mecone.gestor.produto.api.application.ProdutoResponse;

public interface ProdutoService {
	ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest);
	List<ProdutoListResponse> getTodosProdutos();
	ProdutoResponse buscaProdutoPorCodigo(int codigo);
}
