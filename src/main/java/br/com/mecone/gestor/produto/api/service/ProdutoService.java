package br.com.mecone.gestor.produto.api.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.mecone.gestor.produto.api.application.ProdutoDetalhadoResponse;
import br.com.mecone.gestor.produto.api.application.ProdutoListResponse;
import br.com.mecone.gestor.produto.api.application.ProdutoRequest;
import br.com.mecone.gestor.produto.api.application.ProdutoResponse;

public interface ProdutoService {
	List<ProdutoListResponse> getTodosProdutos(UUID idEmpresa);
	ProdutoResponse postProduto(UUID idEmpresa, @Valid ProdutoRequest produtoRequest);
	void deletaProduto(UUID idProduto);
	ProdutoDetalhadoResponse buscaProdutoIdProduto(UUID idProduto);
}
