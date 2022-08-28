package br.com.mecone.gestor.produto.api.service;

import javax.validation.Valid;

import br.com.mecone.gestor.produto.api.application.ProdutoRequest;
import br.com.mecone.gestor.produto.api.application.ProdutoResponse;

public interface ProdutoService {
	ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest);
}
