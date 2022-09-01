package br.com.mecone.gestor.produto.api.application;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.produto.api.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI {
	private final ProdutoService produtoService;

	@Override
	public ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoController -  postProduto");
		ProdutoResponse produtoResponse = produtoService.postProduto(produtoRequest);
		log.info("[finish] ProdutoController -  postProduto");
		return produtoResponse;
	}

	@Override
	public List<ProdutoListResponse> getTodosProdutos() {
		log.info("[start] ProdutoController -  getTodosProdutos");
		List<ProdutoListResponse> produtos = produtoService.getTodosProdutos();
		log.info("[finish] ProdutoController -  getTodosProdutos");
		return produtos;
	}

	@Override
	public ProdutoResponse buscaProdutoPorCodigo(int codigo) {
		log.info("[start] ProdutoController -  buscaProdutoPorCodigo");
		//ProdutoResponse produto = produtoService.buscaProdutoPorCodigo(codigo);
		log.info("[finish] ProdutoController -  buscaProdutoPorCodigo");
		return null;
	}


}
